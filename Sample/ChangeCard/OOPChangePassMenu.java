package Sample.ChangeCard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程)
 * 将各个功能对应一个方法
 */
public class OOPChangePassMenu {
    //OOP面向对象编程

    //属性
    //定义变量
    boolean loop = true;
    Scanner sc = new Scanner(System.in);
    String key;
    String details = "\n----------零钱通明细----------";

    //3.完成收益入账  完成功能驱动程序员增加新的变化和带啊吗
    //定义变量
    double money;
    double balance = 0;
    Date date = new Date();//date 是java.util.Date类型，表示日期
    //获取当前日期，但格式为国外格式，需改成国内格式
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    //月是Mouth，分钟是Minute，通过大小写进行区分

    //4.消费：定义变量，保存消费的原因
    String note;

    //显示菜单，并可以选择
    public void mainMenu() {
        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("\t1 " + "零钱通明细");
            System.out.println("\t2 " + "收益入账");
            System.out.println("\t3 " + "消费");
            System.out.println("\t4 " + "退出");
            System.out.println("请选择（1-4）：");
            key = sc.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.outcome();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("您的菜单选择有误，请重新选择");
                    break;
            }

        }while (loop);
    }

    //零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额：");
        money = sc.nextDouble();
        //money的值应该校验
        //找出不正确的金额条件，然后给出提示，就直接break
        if (money <= 0) {
            System.out.print("请您输入合理的收益入账金额！\n");
            return;//退出方法，不再执行后面的代码
        }

        balance += money;
        //拼接收益入账信息到details
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成消费
    public void outcome() {
        System.out.println("消费金额：");
        money = sc.nextDouble();
        //范围应该校验
        if (money <= 0 | money > balance) {
            System.out.print("请您输入合理的消费金额！\n");
            return;
        }

        System.out.println("消费原因：");
        note = sc.next();
        balance -= money;
        //拼接收益入账信息到details
        details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //完成退出
    public void exit() {
        System.out.println("4 退出");
        //用户输入4退出时，给出提示"你确定要退出吗?y/n"，必须输入正确的y/n
        //否则循环输入指令，直到输入y/n
        //老韩思路分析
        //(1)定义一个变量 choice，接收用户的输入
        //(2)使用 while + break，来处理接收到的输入时 y/n
        //(3)当用户退出while后在判断chioce是y/n，就可以决定是否退出
        //建议：一段代码完成一个小功能，尽量不要混在一起
        String choice;
        while (true) {
            System.out.println("您确定要退出吗？");
            choice = sc.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }//校验输入的内容是否合理
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
