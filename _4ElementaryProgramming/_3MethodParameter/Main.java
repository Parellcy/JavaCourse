package _4ElementaryProgramming._3MethodParameter;

import _4ElementaryProgramming._1ClassAndObjectAnd_4ObjectCopy.Person;

public class Main {
    public static void main(String[] args) {
        //成员方法传递参数

        //一基本数据类型
        System.out.println("==========");
        int a = 14;
        int b = 40;
        AA aa = new AA();
        aa.swap(a,b);
        System.out.println("a = " + a + "\t b = " + b);//14 40
        /*
        栈：main栈+代码运行过程中创建的独立方法空间swap栈
        main栈：实参a->14;实参b->40;aa->堆中的地址（new创建对象），见Class_Object1.java对象内存布局;
        独立方法空间swap栈：代码运行到aa.swap，在栈中创建独立的方法空间，见MemberMethod2_1.java方法调用机制
            形参a = 实参a;形参b = 实参b;打印形参a,形参b
            形参temp = 形参a;形参a = 形参b;形参b =形参temp;打印实参a,实参b
        11行打印的为实参a,实参b;（以上改变的为形参值，实参值并未改变）
        结论：基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参
         */

        //二引用数据类型
        System.out.println("==========");
        BB bb = new BB();
        int[] arr = {1,2,3,4,5};
        bb.test100(arr);
        System.out.println("main的arr数组：");//100 2 3 4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");//遍历数组
        }System.out.println();
        /*
        栈：main栈
        main栈：aa->堆中的地址（new创建对象）;实参arr->0x1100;
        独立方法空间swap栈：代码运行到bb.swap，
            形参arr = 实参arr;->0x1100
            堆：0x1100{1,2,3,4,5} -> 0x1100{100,2,3,4,5}
            打印形参arr数组{100,2,3,4,5}
        打印实参arr数组指向0x1100{100,2,3,4,5}
        结论：引用类型传递的是地址（传得也是数值，但是该数值是地址），可以通过形参改变实参
         */

        //二引用数据类型：例
        System.out.println("==========");
        Person jack = new Person();
        jack.name = "jack";
        jack.age = 18;

        bb.test200(jack);
        System.out.println("main的jack.age = " + jack.age);//10000
        //原因：jack为引用数据类型，test200中形参jack继承实参jack的地址，并改变了地址的值
        //打印实参jack时，二者共享一个地址，打印改变了的age = 10000
        /*个人理解总结一、二
        方法调用关键在于共享以及空间的独立性
        在一中：基本数据类型调用方法开辟了一个独立的空间栈，在这独立的空间栈中a,b互换不影响实参
        在二中：引用数据类型创建时需要new创建对象，形参arr和实参arr共享一个地址中的数据，形参地址改变就意味着实参数据改变

        突发奇想：见ArrayAssignAndCopy1_1.java
            对于一种引用数据类型，举例如Person jack; Person tom;
            对于二者都创建对象new Person();这意味着在堆中开辟出两个地址，相互独立
            此时二者并不 共享 一个地址，也就代表着 数据独立：改变其中一个对象的属性并不影响另外一个对象的属性
            但若是jack = tom;之后tom的地址赋予给jack，二者共享一个地址
         */
        System.out.println("==========");
        Person tom = new Person();
        tom.name = "tom";
        tom.age = 20;
        //一：
        jack = tom;
        System.out.println("jack.name = " + jack.name);
        System.out.println("jack.age = " + jack.age);
        // 结论：类似于数组copy，
        //二：
//        jack.name = tom.name;
//        System.out.println("jack.name = " + jack.name);
//        System.out.println("jack.age = " + jack.age);//10000由于之前代码改变了jack原来的18
        //结论：仅改变了部分属性

        //测试理解，思考51行代码运行结果
        //1.改变 BB类 中 test200 方法的代码为jack = null;
        //1.改变 BB类 中 test200 方法的代码为jack = new Person();jack.name = tom;jack.age = 20;
    }
}
