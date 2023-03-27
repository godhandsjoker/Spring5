package service;

import dao.UserDao;
import dao.UserDaoImp;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void execute() {
        userDao.add();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
