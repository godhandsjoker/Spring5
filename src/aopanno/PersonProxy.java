package aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {
    @After(value = "execution(* aopanno.User.add(..))")
    public void after() {
        System.out.println("after in PersonProxy");
    }
}
