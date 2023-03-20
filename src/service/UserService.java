package service;

import dao.UserDao;

public class UserService {
    public void execute() {
        UserDao userDao = UserFactory.createDao();
    }
}


class UserFactory {
    public static UserDao createDao() {
        return new UserDao();
    }
}