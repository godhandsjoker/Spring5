package service;

import dao.UserDao;

public class UserService {
    public void execute() {
        UserDao userDao = new UserDao();
        userDao.add();
    }
}
