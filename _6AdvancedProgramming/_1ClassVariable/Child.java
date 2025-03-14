package _1ClassVariable;

public class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println("Child " + name + "joined!");
    }

    //优化内容如下
    //定义一个类变量/静态变量count
    //该变量最大的特点就是会被 Child类的所有对象共享!!!
    public static int count = 0;

}
