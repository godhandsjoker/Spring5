package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* aopanno.User.add(..))")
    public void point() {
    }

    @Before(value = "point()")
    public void before() {
        System.out.println("before in UserProxy");
    }

    @After(value = "point()")
    public void after() {
        System.out.println("after in UserProxy");
    }

    @AfterThrowing(value = "point()")
    public void afterThrowing() {
        System.out.println("afterThrowing in UserProxy");
    }

    @AfterReturning(value = "point()")
    public void afterReturning() {
        System.out.println("afterReturning in UserProxy");
    }

    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }
}
