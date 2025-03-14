package _4ElementaryProgramming._2_3Method;

public class A {
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    public void print(int n) {
        System.out.println("A类print方法被调用：n=" + n);
    }

    public void sayOk() {//sayOk调用方法print，直接调用
        print(10);//直接调用
        System.out.println("继续调用A类sayOk");
    }

    public void sayBclass() {
        B b = new B();
        b.sayOk();
        System.out.println("继续调用A类sayBclass");
    }
}
