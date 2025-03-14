package _4ElementaryProgramming._8Scope;

import _4ElementaryProgramming._1ClassAndObjectAnd_4ObjectCopy.Person;

public class Teacher {
    int age = 28;//全局变量age，同时指定为28
    String name = "Alisa";

    public void say() {
        int n = 99;//局部变量n
//        int n = 88;//细节2，报错，因于上方局部变量n重名
        String name = "段九九";//局部变量name
        //二者作用域在say方法中
//        String job;
//        System.out.println(job);
        //报错：局部变量job未赋值，无法使用
        System.out.println("name = " + name);
    }

    public void eat() {
        System.out.println("在eat方法中使用全局变量age = " + age);
//        System.out.println("在eat方法中使用cry方法中的局部变量name = " + name);
        //程序找不到name
    }

    public void catAge() {
        Person person = new Person();
        System.out.println("打印Person类中age的值" + person.age);
    }
}
