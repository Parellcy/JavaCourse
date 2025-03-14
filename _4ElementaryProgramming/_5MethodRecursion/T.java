package _4ElementaryProgramming._5MethodRecursion;

public class T {
    //打印问题
    public void test1(int n) {
        if (n > 2) {
            test1(n - 1);
        }
        System.out.println("n = " + n);
    }

    public void test2(int n) {
        if (n > 2) {
            test2(n - 1);
        } else {
            System.out.println("n = " + n);
        }
    }

    //阶乘问题
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
