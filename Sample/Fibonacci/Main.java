package Sample.Fibonacci;

public class Main {
    public static void main(String[] args) {
        //斐波那契数
        FibonacciNumber fib = new FibonacciNumber();
        int n = 6;//在此处更改n的值，获取斐波那契数
        int res =fib.fibonacciN(n);
        if (res != -1) {
            System.out.println("当n = "+n+"时，斐波那契数为："+res);
        }

    }
}





