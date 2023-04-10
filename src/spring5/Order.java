package spring5;

public class Order {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("This is setting 2");
    }

    public Order() {
        System.out.println("This is Order 1");
    }

    public void initMethod() {
        System.out.println("This is initMethod 3");
    }

    public void destroyMethod() {
        System.out.println("5. destroyMethod");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
