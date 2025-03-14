package _4ElementaryProgramming._2_2Method;

public class Main {
    public static void main(String[] args) {
        //成员方法的妙用

        Mytools arrayTools = new Mytools();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        arrayTools.printArray(arr1);
        arrayTools.printTwoDimensionArray(arr2);

        /*类似于扳手和螺丝
        我创建了扳手类并定义了拧螺丝的方法
        创建螺丝类
        通过扳手类对象调用含有螺丝类参数的拧螺丝方法
         */
    }
}
