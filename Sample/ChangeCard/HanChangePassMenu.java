package Sample.ChangeCard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HanChangePassMenu {
        //面向过程编程
        /*化繁为简
        1.先完成显示菜单，并可以选择
        2.完成零钱通明细
            韩顺平老师思路：
            1.收益入账和消费保存到数组中，问题：数组需要制成动态的
            2.使用对象
            3.简单的话使用String拼接
        3.完成收益入账  完成功能驱动程序员增加新的变化和带啊吗
        4.完成消费
         */
    public static void main(String[] args) {
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
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = sc.nextDouble();
                    //money的值应该校验
                    //找出不正确的金额条件，然后给出提示，就直接break
                    if (money <= 0) {
                        System.out.print("请您输入合理的收益入账金额！\n");
                        break;
                    }

                    balance += money;
                    //拼接收益入账信息到details
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;

                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = sc.nextDouble();
                    //范围应该校验
                    if (money <= 0 | money > balance) {
                        System.out.print("请您输入合理的消费金额！\n");
                        break;
                    }

                    System.out.println("消费原因：");
                    note = sc.next();
                    balance -= money;
                    //拼接收益入账信息到details
                    details += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;

                    break;
                case "4":
                    System.out.println("4 退出");
                    //用户输入4退出时，给出提示"你确定要退出吗?y/n"，必须输入正确的y/n
                    //否则循环输入指令，直到输入y/n
                    //老韩思路分析
                    //(1)定义一个变量 choice，接收用户的输入
                    //(2)使用 while + break，来处理接收到的输入时 y/n
                    //(3)当用户退出while后在判断choice是y/n，就可以决定是否退出
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
                    break;
                default:
                    System.out.println("您的菜单选择有误，请重新选择");
                    break;
            }

        }while (loop);

        System.out.println("退出了零钱通项目");
    }
}
