package aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class User {
    public void add() {
        System.out.println("add in User");
    }
}

