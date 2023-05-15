package dao;

import entity.User;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values(?, ?, ?)";
        Object[] args = {user.getUserId(), user.getUsername(), user.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql = "update user set username = ?, ustatus = ? where user_id = ?";
        Object[] args = {user.getUsername(), user.getUstatus(), user.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from user where user_id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }

    @Override
    public User findUser(String id) {
        String sql = "select * from user where user_id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return query;
    }
}
