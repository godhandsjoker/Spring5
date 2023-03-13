import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.User;

public class MyTest {
    @Test
    public void Test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.fun();
    }
}
