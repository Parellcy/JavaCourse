package _4ElementaryProgramming._6OverLoadAnd_7VariableParameter;

public class Main {
    public static void main(String[] args) {
        //方法重载

        /*例
        System.out.println();out是PrintStream类型
        在打印时的形参不同
         */
        System.out.println("==========");
        System.out.println(100);
        System.out.println("Hello World");
        System.out.println('H');
        System.out.println(1.1);
        System.out.println(true);

        //自定义方法重载尝试
        Calculator calc = new Calculator();
        System.out.println("int add1 = " + calc.add(1, 2));
        System.out.println("double add2 = " + calc.add(1,1.8));
        System.out.println("double add3 = " + calc.add(1.8,1));
        System.out.println("int add4 = " + calc.add(1,2,3));

        //可变参数
        System.out.println("可变参数 = " + calc.add(1,3,5,7,9,11,13,15,17,19));
        //细节二数组做实参
        int arr[] = {1,2,3};
        System.out.println("可变参数（数组作实参） = " + calc.add(arr));
        System.out.println("可变参数（普通类型 + 可变参数） = " + calc.add(1.8,3.6,arr));

    }
}

/*重载的好处
减轻了起名的麻烦
减轻了记名的麻烦
 */

/*可变参数
Java中允许将同一个类中 多个同名 同功能 但 参数个数不同 的方法，封装成一个方法
    访问修饰符 返回类型 方法名(数据类型... 形参名) {
        代码块;
    }
细节：
1.可变参数的实参可以为0 - 任意多
2.可变参数的实参可以为数组
3.可变参数的本质就是数组
4.可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
5.一个形参列表中只能出现一个可变参数
 */