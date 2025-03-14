package _2ControlStructure;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println("i=" + i);
        }

        //1-100求和，当大于某个值是break
        System.out.println("==========");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum >521){
                System.out.println("i=" + i);
                System.out.println("sum=" + sum);
                break;
            }
        }

        //输入姓名和密码登录，有三次机会
        System.out.println("==========");
        Scanner sc = new Scanner(System.in);
        String name;
        String password;
        int chance = 3;
        for (int i = 1; i <= chance; i++) {
            System.out.println("Enter your name:");
            name = sc.nextLine();
            System.out.println("Enter your password:");
            password = sc.nextLine();
            if (name.equals("霍占鳌") & password.equals("fwfwfw")) {//匹配姓名密码是否正确
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("您还有"+(chance-i)+"次机会");
            }
        }
    }
}
/*break
1.break用于终止某个语句块的执行
一般使用在switch、while、do...while中

        {
        ...
        break;
        ...
    }
2.
break语句出现在多层嵌套语句块时
可以通过标签指明终止的是哪一部分语句块

    label1:{......
    label2:     {......
    label3:         {
                    ......
                    break label2;
                    ......
                    }
                }
           }

label是标签，由程序员指定
在实际的开发中，尽量不要使用标签
如果没有指定break，默认退出最近的循环体
*/
