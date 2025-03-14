package _2ControlStructure;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int age;
        int month;
        Scanner tourist = new Scanner(System.in);
        System.out.print("Enter now month : ");
        month = tourist.nextInt();
        System.out.print("Enter now age : ");
        age = tourist.nextInt();
        if (month >= 4 & month <= 10) {
            if (age >= 18 & age <= 60) {
                System.out.println("成人（18-60）：60");
            }else if ( age >= 0 & age < 18){
                System.out.println("儿童（<18）：半价");
            }else if (age > 60) {
                System.out.println("老人（>60）：1/3");
            }else{
                System.out.println("请输入正确的年龄");
            }
        }else if(month < 4 & month >= 1){
            if (age >= 18 & age <= 60) {
                System.out.println("成人（18-60）：40");
            }else{
                System.out.println("其他：20");
            }
        }else if(month > 10 & month <= 12){
            if (age >= 18 & age <= 60) {
                System.out.println("成人（18-60）：40");
            }else if(age < 0){
                System.out.println("请输入正确的年龄");
            }else{
                System.out.println("其他：20");
            }
        }else {
            System.out.println("请输入正确的月份");
        }
    }
}
/*if-else
1.单分支

    if(条件表达式){
        代码块;//可以存在多条语句
    }
条件表达式若为False，按照程序运行顺序跳出if选择

2.双分支

    if(条件表达式){
        代码块1;//可以存在多条语句
    }else{
        代码块2;
    }

3.多分支
多分支可以没有else
假如没有else，如果所以的条件表达式都不成立，则一个执行入口都没有
假如存在else，如果所以的条件表达式都不成立，则默认执行else

    if(条件表达式1){
        代码块1;//可以存在多条语句
    }else if(条件表达式2){
        代码块2;
    }else if(条件表达式3){
        代码块3;
    }else if(条件表达式4){
        代码块4;
    }
    ...
    else if(条件表达式m){
        代码块m;
    }else{
        代码块n;
    }

4.嵌套分支
建议不要超过三层

    if(){
        ...
        if(){
            ...1
            if(){
                ...2
                if(){
                    ...3
                }else{
                    ...3
                }
            }else{
                ...2
            }
        }else{
            ...1
        }
    }else{
        ...
    }

 */