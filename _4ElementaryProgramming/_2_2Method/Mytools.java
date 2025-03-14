package _4ElementaryProgramming._2_2Method;

public class Mytools {
    public void printArray(int[] arr) {
        System.out.println("==========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public void printTwoDimensionArray(int[][] arr) {
        System.out.println("\n==========");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*成员方法的好处
1.提高代码的复用性
2.可以将实现的细节封装起来，然后供其他用户调用即可
 */