package dao;

import entity.User;

import java.util.List;

public interface UserDao {

    void add(User user);

    void update(User user);

    void delete(String id);

    int selectCount();

    User findUser(String id);

    List<User> findAllUser();
}
