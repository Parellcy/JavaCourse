package _2ControlStructure;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  字符串类型
        System.out.println("==========");
        String str;
        String Y = "Yes";
        String N = "No";

        do {
            System.out.println("A五连鞭B");
            System.out.println("A:还钱吗？Yes/No");
            str = sc.nextLine();
            System.out.println("B:"+str);
        }while (!str.equals(Y));

        //字符类型
        System.out.println("==========");
        char answer;
        do {
            System.out.println("A五连鞭B");
            System.out.println("A:还钱吗？Y/N");
            answer = sc.next().charAt(0);
            // Scanner.next().charAt(0)具体含义就是，获取用户输入的字符串中的第一个字符
            // 若想获取第二个，则charAt(1);
            System.out.println("B:"+answer);
        }while (answer != 'Y');

        //随机抽取1-100中一个数，抽取到97停止，并积累次数
        int number;
        int count = 0;
        do {
            number = (int)(Math.random()*100+1);
            System.out.println(number);
            count++;
        }while (number != 97);
        System.out.println("次数为"+count);
    }
}
//  疑惑：string不可行
//  解惑：判断字符串内容是否相等使用关系运算符是不可取的
//       equals()比较字符串对象中的字符
//       而==运算符比较两个对象引用看它们是否引用相同的实例。
//  补充：equals()方法、equalsIgnoreCase()方法、 compareTo()方法
/*
1.equals()

    str1.equals(str2);

equals() 方法将逐个地比较两个字符串的每个字符是否相同
如果两个字符串具有相同的字符和长度，它返回 true，否则返回 false
对于字符的大小写，也在检查的范围之内
2.equalsIgnoreCase()

    str1.equalsIgnoreCase(str2)

equalsIgnoreCase()的作用和语法与equals()方法完全相同
唯一不同的是equalsIgnoreCase()比较时不区分大小写
当比较两个字符串时，它会认为 A-Z 和 a-z 是一样的
3.compareTo()
compareTo()方法用于按字典顺序比较两个字符串的大小

    str.compareTo(String otherstr);

它会按字典顺序将str表示的字符序列与otherstr参数表示的字符序列进行比较
如果按字典顺序str位于otherster参数之前，比较结果为一个负整数
如果str位于otherstr之后，比较结果为一个正整数
如果两个字符串相等，则结果为 0。
 */

//  next()方法读取到空白符就结束l；
//  nextLine()读取到回车结束也就是“\r”；

/*while

    循环变量初始化;
    while(循环条件){
        循环体（语句）;
        循环变量迭代;
    }

循环条件是返回一个布尔值的表达式
先判断再执行
 */

/*do while

    循环变量初始化;
    do{
        循环体（语句）;
        循环变量迭代;
    }while(循环条件);

do while是关键字
先执行再判断，必定会执行一次
while后有;存在
 */