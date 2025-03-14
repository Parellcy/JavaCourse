package _2ControlStructure;

public class For {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int n = 1; n <= 100; n++) {
            if (n % 9 == 0) {
                System.out.print(n+" ");
                int number = n;
                sum = sum + number;
                count++;
            }
        }
        System.out.println("\n个数为："+count);
        System.out.println("总和为："+sum);
    }

}
/*循环控制for

    for(循环变量初始化;循环条件;循环变量迭代;){
        循环操作（语句）;
    }

循环条件是返回一个布尔值的表达式
循环变量初始化和循环变量迭代可以写在其他地方，但分号不可省略
循环初始值可以有多条初始化语句，但要求类型一样，中间用逗号隔开
循环变量迭代可以有多条变量迭代语句，中间用逗号隔开
 */
