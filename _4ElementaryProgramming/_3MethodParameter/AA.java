package _4ElementaryProgramming._3MethodParameter;

public class AA {
    public void swap(int a, int b) {//一基本数据类型
        System.out.println("交换前a = " + a + "\tb = " + b);//14 40
        //完成a和b的交换
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后a = " + a + "\tb = " + b);//40 14
    }
}
