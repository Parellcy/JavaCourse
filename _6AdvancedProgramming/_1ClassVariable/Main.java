package _1ClassVariable;

public class Main {
    public static void main(String[] args) {
        /*问题导入
        有一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在共有多少人在玩？
         */
        /*传统方法
        思路：
        1.在main方法中定义一个变量count;
        2.当一个小孩加入游戏后 count++,最后一个 count 就记录有多少小孩玩游戏
         */
        int count = 0;
        Child child1 = new Child("白骨精");
        child1.join();
        count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        count++;

        Child child3 = new Child("老鼠精");
        child3.join();
        count++;

        System.out.println("共有 " + count + "小孩加入了游戏");
        /*问题分析:
        1.count是一个独立于对象，很尴尬
        2.以后我们访问 count 很麻烦，没有使用到OOP
        3.因此，我们引出 类变量/静态变量
         */

        //优化见Child类
//        child1.count++;
//        child2.count++;
//        child3.count++;
//        System.out.println("共有 " + Child.count + "小孩加入了游戏");//类变量可以通过类名来访问
        //测试时注释上方count++

        //回答以下代码输出什么，理解类变量/静态变量
//        System.out.println("child1 = " + child1.count);
//        System.out.println("child2 = " + child2.count);
//        System.out.println("child3 = " + child3.count);

    }
}
/*类变量内存布局
count在内存哪里存在不同的说法（两种说法，以及JDK版本不一样）
1.count在堆中
    栈：child1->0x0010，child2->0x0020，child3->0x0030
    堆：0x0010[0x0011,0x0012]，0x0020[0x0021,0x0022]，0x0030[0x0031,0x0032]
       0x0012,0x0022,0x0032->count
    方法区：0x0011->白骨精，0x0021->狐狸精，0x0031->老鼠精
2.count在静态域中
    栈：child1->0x0010，child2->0x0020，child3->0x0030
    堆：0x0010[0x0011,0x0012]，0x0020[0x0021,0x0022]，0x0030[0x0031,0x0032]
    方法区：0x0011->白骨精，0x0021->狐狸精，0x0031->老鼠精
        静态域：0x0012,0x0022,0x0032->count
方法区存在静态域（一种任务count在堆中，一种认为count在静态域中），不管哪种说法，count都会被所有child类对象共享使用

 */