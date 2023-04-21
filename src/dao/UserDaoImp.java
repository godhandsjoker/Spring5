package dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImp")
public class UserDaoImp implements UserDao {
    @Override
    public void add() {
        System.out.println("add");
    }
}
