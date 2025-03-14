package _2ControlStructure;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("输入月份：");
        int month = myScanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
        }
    }
}
/*switch

    switch(表达式){    //计算表达式中的值与case匹配
        case 常量1:   //当...（你的表达式==常量1时执行语句块1）
        语句块1;
        break;
        case 常量2:   //当...（你的表达式==常量2时执行语句块2）
        语句块2;
        break;
        ...
        case 常量m:   //当...（你的表达式==常量m时执行语句块m）
        语句块m;
        break;
        default:    //没有一个与case匹配上，执行default
        语句块n;
         break;
    }

表达式的数据类型与常量值的数据类型一致，或类型可以相互转换
可允许的数据类型（byte，short，int，long，char，string，enum[]枚举，）
default可以不存在
 */