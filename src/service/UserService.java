package service;

import dao.UserDao;
import dao.UserDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Indexed;

import javax.annotation.Resource;

@Component(value = "userService")
public class UserService {
    @Resource(name = "userDaoImp")
    private UserDao userDao;

    @Value(value = "aaa")
    private String str;

    public void fun() {
        System.out.println(str);
        userDao.add();
        System.out.println("UserService fun");
    }
}
