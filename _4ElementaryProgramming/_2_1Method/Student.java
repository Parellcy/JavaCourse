package _4ElementaryProgramming._2_1Method;

public class Student {
    public String name;
    public int age = 32;
    public String job;

    public void speak() {
        System.out.println("==========");
        System.out.println("I'm Student");
    }

    //pubic表示该方法是公开的
    //void表示方法没有返回值
    //()为形参列表，{}方法体，可以写要执行的代码
    //方法不去调用，不会输出
    public void cal01() {
        System.out.println("==========");
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            res += i;
        }
        System.out.println("cal01方法 计算结果：" + res);
    }//计算从1到10的总和

    public void cal02(int n) {
        System.out.println("==========");
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02方法 计算结果：" + res);
    }//接受一个参数n，计算从1到n的总和

    //(int n)表示当前有个形参n，用于接收用户输入
    public int getSum(int num1, int num2) {
        System.out.println("==========");
        int res = num1 + num2;
        return res;
    }
    //int表示该方法执行后返回int类型的值
    //return res;表示返回res的值
}
