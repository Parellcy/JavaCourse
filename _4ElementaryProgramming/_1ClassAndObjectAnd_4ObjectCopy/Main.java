package _4ElementaryProgramming._1ClassAndObjectAnd_4ObjectCopy;

public class Main {
    public static void main(String[] args) {
        //类与对象
        //对象拷贝

        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 20;
        tom.job = "Teacher";

        Cat cat1 = new Cat("小黄",5,"黄色");

        //内存分配理解测试，请思考以下程序的运行结果如何
        //由于以下程序会产生异常导致之后代码无法运行
        //去掉注释查看结果
//        Person a = new Person();
//        a.name = "A";
//        a.age = 27;
//        a.job = "Teacher";
//        Person b = new Person();
//        b = a;
//        System.out.println(b.name);
//        b.age = 16;
//        b = null;
//        System.out.println(a.age);
//        System.out.println(b.job);

        //27-34部分为引用数据类型copy部分，应为本章第四节内容
        //由于Person位置在第一节，故将内容放到此处
        System.out.println("==========");
        Person jack = new Person();
        jack.copyPersonOne(tom);
//        jack = jack.copyPersonTwo(tom);
        System.out.println("jack.name = "+jack.name);
        System.out.println("jack.age = "+jack.age);
        System.out.println("jack.job = "+jack.job);
    }
}
/*类与对象（OOP编程）
Java设计者引用其的根本原因就是现有的技术不能完美解决新的需求
一个程序就是一个世界，有很多事物（对象[属性，行为]）
举例：人类Person[属性name,job...行为study,teach];猫类Cat[属性...行为...]
 */

/*对象内存布局
栈：cat1->0x1100
堆：0x1100{0x0011(name),5(age),0x0033(color)}
方法区（常量池、）：常量池：0x0011->小黄，0x0033->黄色；

age为int基本数据类型在堆中直接存放数值而非地址
在执行创建对象的时候还存在一个过程：就是把我们类的信息加载到方法区（会加载Cat类信息：1.属性信息2.行为方法信息）

Cat只是一个引用，又叫对象引用或者对象名，它的作用是指向对象，即堆和方法区中的数据元素
 */

/*属性/成员变量
成员变量是用来表示属性的，成员变量=属性=field
属性是类的一个组成部分，一般是基本数据类型，也可以是引用数据类型（对象、数组）
例：定义Cat类的int age就是属性
使用细节：
    1.属性的定义语法同变量，多了访问修饰符
    2.属性的定义可以是任意类型
    3.属性如果不赋值，有默认值
 */

/*如何创建对象
1.先声明再创建
    Cat cat;声明对象Cat：在栈中创建cat->[?]
    cat = new Cat();创建：在堆中创建属性使cat连入地址
2.直接创建
    Cat cat = new Cat();
 */

/*如何访问属性
对象名.属性名
cat.name;cat.age;cat.color;
 */

/*java内存局部分析
栈：一般存放基本数据类型（局部变量）
堆：存放对象（Cat cat;数组等）
方法区：常量池（常量，比如字符串），类加载信息
 */