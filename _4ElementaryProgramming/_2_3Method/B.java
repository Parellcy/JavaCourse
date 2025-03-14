package _4ElementaryProgramming._2_3Method;

public class B {
    public void print(int n) {
        System.out.println("B类print方法被调用：n=" + n);
    }

    public void sayOk() {//sayOk调用方法print，直接调用
        print(10);//直接调用
        System.out.println("继续调用B类sayOk");
    }

}
