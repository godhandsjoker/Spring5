package testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {

        MyUserDaoImp myUserDaoImp = new MyUserDaoImp();

        Class[] interfaces = {MyUserDao.class};
        MyUserDao o = (MyUserDao) Proxy.newProxyInstance(MyUserDaoImp.class.getClassLoader(), interfaces, new MyUserDaoProxy(myUserDaoImp));

        int add = o.add(2, 3);
        System.out.println(add);

        String hhh = o.update("hhh");
        System.out.println(hhh);
    }
}

class MyUserDaoProxy implements InvocationHandler {
    private Object obj;

    public MyUserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("新加入的功能，在方法执行之前执行" + method.getName() + ",所传参数" + Arrays.toString(objects));
        Object res = method.invoke(obj, objects);
        System.out.println("新加入的功能，在方法之后执行" + obj);
        return res;
    }
}