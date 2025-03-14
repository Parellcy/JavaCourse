package _4ElementaryProgramming._9StructureMethodOrDeviceAnd_10This;

public class Dog {
    public String name;
    public int age;
    public String master;

    //1.原始有参构造器
    public Dog(String pname, int page) {//构造方法(构造器)
        System.out.println("==========");
        name = pname;
        age = page;
        System.out.println("原始构造器被调用");
    }

    //构造器输入的参数名不是非常友好，如果能直接将int pname改成name就好了
    //于是就有了This关键字
    //2.this关键字构造器
    public Dog(String name, int age, String master) {
        this("green", 4);
        System.out.println("原始有参构造器被调用原因是因为在this构造方法中使用了this去调用原始构造方法");
        System.out.println("==========");
        this.name = name;
        this.age = age;
        this.master = master;
        //举例解释：为dog2创建对象时，将实参name传给形参name
        //系统自动调用构造方法，将形参name传给当前对象的name，即dog2的name
        /*内存调用原理
        栈：dog2 -> 0x1100
        堆：ox1100{name -> 0x0011;age：3;master -> 0x0022;this -> 0x1100;}
        方法区：常量池：Blue:0x0011;Tom:0x0022
         */
        System.out.println("this构造器被调用");
        this.eat();
    }

    public void eat() {
        System.out.println("在this构造器中通过this调用方法eat");
        this.sleep();
    }

    public void sleep() {
        System.out.println("在方法eat中通过this调用方法sleep");
    }
}
