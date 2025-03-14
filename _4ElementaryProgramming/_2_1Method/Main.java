package _4ElementaryProgramming._2_1Method;

public class Main {
    public static void main(String[] args) {
        //成员方法概念的引入
        Student jack =  new Student();
        jack.name = "Jack";
        jack.age = 18;
        jack.speak();
        jack.cal01();
        jack.cal02(5);
        System.out.println("求和="+jack.getSum(3,8));
    }
}
/*成员方法
举例说明：人类：除了有一些属性外（年龄、姓名...），还存在一些行为（说话、跑步...）
 */

/*方法调用机制
程序按顺序正常执行
当执行到方法时，就会在栈中开辟一个独立的空间，然后执行方法中的代码
当方法执行完毕或者执行到return语句时，就会返回到调用方法的地方
返回后，继续执行方法后面的代码
main方法执行完毕，整个程序退出
 */