import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import spring5.Book;
import spring5.Emp;
import spring5.Order;
import spring5.User;

public class MyTest {
    @Test
    public void Test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.fun();
    }

    @Test
    public void Test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void Test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void Test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
    }

    @Test
    public void Test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.execute();
        System.out.println(userService);
    }

    @Test
    public void Test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
