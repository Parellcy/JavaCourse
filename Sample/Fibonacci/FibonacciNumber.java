package Sample.Fibonacci;

class FibonacciNumber {
    public int fibonacciN(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacciN(n - 1) + fibonacciN(n - 2);
            }
        } else {
            System.out.println("要求输入的n >= 1");
            return -1;
        }
    }
}
