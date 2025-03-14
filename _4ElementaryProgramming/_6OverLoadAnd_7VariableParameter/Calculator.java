package _4ElementaryProgramming._6OverLoadAnd_7VariableParameter;

public class Calculator {//计算器

    public int add(int a, int b) {
        System.out.println("==========");
        return a + b;
    }

    //    public void add(int a, int b) {
//        System.out.println("==========");
//        int res =  a + b;
//    }//没有构成方法重载，会弹出报错，故注释掉
//    public int add(int a, int b) {
//        System.out.println("==========");
//        return a + b;
//    }//此为方法的重新定义，会弹出报错，故注释掉
    public double add(int a, double b) {
        System.out.println("==========");
        return a + b;
    }

    public double add(double a, int b) {
        System.out.println("==========");
        return a + b;
    }

    //可变参数
    public int add(int a, int b, int c) {
        System.out.println("==========");
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        System.out.println("==========");
        return a + b + c + d;
    }

    //以上方法：多个同名 同功能 但 参数个数不同 -> 使用可变参数优化
    //int... 表示接受的是可变参数，类型为int，即可以接受多个int(0 - 多)
    //使用可变参数时，可以当作数组来适应，即 nums 可以当作数组
    //可当作数组，那就遍历求和
    public int add(int... nums) {
        System.out.println("==========");
        System.out.println("接收参数数量为：" + nums.length);
        int sum = 0;
        for (int num = 0; num < nums.length; num++) {
            sum += nums[num];
        }
        return sum;
    }

    public double add(double x, double y, int... nums) {
        System.out.println("==========");
        System.out.println("接收参数数量为：" + nums.length);
        int sum = 0;
        for (int num = 0; num < nums.length; num++) {
            sum += nums[num];
        }
        return sum + x + y;
    }
//    public double add(int... nums,double n) {
//        System.out.println("==========");
//        System.out.println("接收参数数量为："+nums.length);
//        int sum = 0;
//        for (int num = 0;num < nums.length; num++) {
//            sum += nums[num];
//        }
//        return sum + n;
//    }//可变参数放在前面发生报错，故注释掉
}/*方法重载
java中允许同一个类中，多个同名方法的存在，但要求形参列表不一致
注意：
1.方法名必须相同
2.参数列表必须不同
3.返回类型无要求，其不是方法重载的必要条件
 */
