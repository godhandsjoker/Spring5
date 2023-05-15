package service;

import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserService {
    @Resource
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(String id) {
        userDao.delete(id);
    }

    public int findCount() {
        return userDao.selectCount();
    }

    public User findUser(String id) {
        return userDao.findUser(id);
    }

    public List<User> findAll() {
        return userDao.findAllUser();
    }
}
