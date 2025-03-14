package Sample.ChangeCard;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyChangePassMenu {
    //面向过程编程
    /*收获
    1.String details += ？？？;拼接
    2.获取当前时间：
        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sdf.format(date);
    3.建议：一段代码完成一个小功能，尽量不要混在一起
     */
    public static void main(String[] args) {
        /*
        ----------零钱通菜单----------
            1 零钱通明细
            2 收益入账
            3 消费
            4 退出
        请选择（1-4）：
        ----------零钱通明细----------
        收益入账    +100.0    2021-01-21 17:41    余额:100.0
        收益入账    +500.0    2021-01-21 17:42    余额:600.0
        真功夫    -20.0    2021-01-21 17:43    余额:580.0
         */
        Scanner scanner = new Scanner(System.in);

        boolean choose = true;

        Double come;
        String inComeName;
        String outComeName;

        Date date;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Double balance = 0.0;
        String details = "----------零钱通明细----------\n";

        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("\t1 " + "零钱通明细");
            System.out.println("\t2 " + "收益入账");
            System.out.println("\t3 " + "消费");
            System.out.println("\t4 " + "退出");
            System.out.println("请选择（1-4）：");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("----------收益入账----------");
                    System.out.print("收益入账名称：");
                    inComeName = scanner.next();

                    System.out.print("收益入账金额：");
                    //个人思考，不去中断选择二，通过重复询问校验输入正确的值
                    //注释掉的代码可以重复询问，但当又改为正确值时因为回车的问题无法使程序正常运行
//                  boolean in = true;
//                    do {
//                        come = scanner.nextDouble();
//                        if (come <= 0) {
//                            System.out.print("请您输入合理的收益入账金额：\n");
//                            in = false;
//                        }
//                    }while (!in);
                    /*改进：
                    结合韩顺平老师的在选择四：退出零钱通的代码思路
                        String chioce;
                        while (true) {
                            System.out.println("您确定要退出吗？");
                            chioce = sc.next();
                            if ("y".equals(chioce) || "n".equals(chioce)) {
                                break;
                            }//校验输入的内容是否合理
                        }
                        if (chioce.equals("y")) {
                            loop = false;
                        }
                    以及循环条件
                    if (money <= 0) {
                        System.out.print("请您输入合理的收益入账金额！\n");
                        break;
                    }
                     */
                    while (true) {
                        come = scanner.nextDouble();
                        if (come <= 0) {
                            System.out.println("请您输入合理的收益入账金额：");
                        }else {
                            break;//跳出while循环
                        }
                    }

                    balance += come;
                    date = new Date();
                    details += inComeName + "\t\t+" + come + "\t\t" + sdf.format(date) + "\t\t余额:" + balance + "\n";
                    break;
                case 3:
                    System.out.println("----------消费----------");
                    System.out.print("消费名称：");
                    outComeName = scanner.next();
                    System.out.print("消费金额：");
                    come = scanner.nextDouble();
                    if (come <= 0 | come > balance) {
                        System.out.print("请您输入合理的消费金额！\n");
                        break;
                    }
                    balance -= come;
                    date = new Date();
                    details += outComeName + "\t\t-" + come + "\t\t" + sdf.format(date) + "\t\t余额:" + balance + "\n";
                    break;
                case 4:
                    System.out.println("----------退出----------");
                    String loop;
                    while (true) {
                        System.out.println("您确定要退出吗？");
                        loop = scanner.next();
                        if ("y".equals(loop) || "n".equals(loop)) {
                            break;
                        }
                    }
                    if (loop.equals("y")) {
                        choose = false;
                    }
                    break;
                default:
                    System.out.println("您输入的选项不合理！请重新输入：");
                    break;
            }
        }while (choose);

        System.out.println("您成功退出了零钱通");
    }
}
