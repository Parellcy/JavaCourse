package _4ElementaryProgramming._9StructureMethodOrDeviceAnd_10This;

public class Main {
    public static void main(String[] args) {
        //构造方法(构造器)
        Dog dog1 = new Dog("Yellow",4);
        System.out.println("dog1的name = " + dog1.name);
        Dog dog2 = new Dog("Blue",3,"Tom");
        System.out.println("dog1的name = " + dog2.name);
    }

}
/*构造方法/构造器
在创建某数据类型的对象时，可以直接指定这个对象的属性
    修饰符 方法名 (形参列表) {
        方法体
    }
构造方法/构造器是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。
它有以下特点：：
    1.构造器的修饰符可以默认，也可以是public、protected、private
    2.构造器没有返回值
    3.方法名和类名必须一样
    4.参数列表和成员方法一样的规则
    5.构造器的调用，系统完成
注意事项：
    1.一个类可以定义多个不同的构造器，即构造器重载
    2.构造器是完成对象的初始化，而不是创建对象
    3.在创建对象时，系统自动的调用该类的构造方法
    4.如果没有定义构造方法，系统会自动给类生成一个 默认无构造方法（也叫默认构造方法）
    5.一旦定义了构造器，默认的构造器就被覆盖了，就不能再使用默认的无参构造器
 */

/*This
Java虚拟机会给每个对象分配this，代表 当前 对象。
举例：对于Dog类，创建dog2对象，this.name代表dog2的name
小结：哪个对象调用，this就代表哪个对象
注意事项和使用细节：
    1.this关键字可以用来访问本类的属性、方法、构造器
    2.this用于区分当前类的属性和局部变量
    3.访问成员方法的语法：this.方法名(参数列表);
    4.访问构造器的语法：this(参数列表);  注意只能在构造器中使用，且必须放置在代码块的第一条
    详见第26行
    5.this不能在类定义的外部使用，只能在类定义的构造器、方法中使用
    详见第26、44行
 */
