package _3ArrayAndSortAndLookUp;

import java.util.Scanner;

public class _1_3ArrayDilatation {
    public static void main(String[] args) {
        //数组的扩容和缩减

        //add与reduce共有内容
        String respondone = "是";
        String respondtwo = "否";
        Scanner sc = new Scanner(System.in);

        //add
        System.out.println("==========");
        System.out.println("是否添加数字？（是|否）");
        String respond1 = sc.nextLine();
        //创建变量接收新的内容与是否添加数字的判断
        int rember1;
        String respond11;
        int[] arr1 = {1,2,3};//原数组
        if (respond1.equals(respondone)){
            do {
                int[] arrAdd = new int[arr1.length + 1];//创建新数组用来接收原数组与新的内容
                for (int i = 0; i < arr1.length; i++) {
                    arrAdd[i] = arr1[i];
                }
                System.out.println("添加数字：");
                rember1 = sc.nextInt();
                arrAdd[arrAdd.length - 1] = rember1;//所接收到的内容赋值给新数组
                arr1 = arrAdd;//新数组的内容复制给原数组
//              sc.nextLine();
                System.out.println("是否继续添加数字？（是|否）");
                respond11 = sc.next();//    在这里使用nextline会出现问题
                //原因：当next/nextInt和nextLine连用的时候，next不会接收enter
                //此时enter还留在sc中，如果下一次输入还是用next的话，也会跳过enter继续接收后面的字符串
                //但是下一次如果是nextLine的话，他就会接收上一个enter进而直接结束本次输入
                //解决方法：遇到此种情况,我们可以在中间加一个sc.nextLine()专门用来接收空格,此时代码正常
            }while (respond11.equals(respondone));
            System.out.println("打印数组：");
        }else if(respond1.equals(respondtwo)){
            System.out.println("打印数组：");
        }
        for (int j : arr1) {
            System.out.print(j + " ");
        }//打印添加后的数组
        //for的缩写用法（idea帮助修改）内容大体如下：
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        System.out.println("\n结束添加");

        //reduce
        System.out.println("==========");
        System.out.println("是否删除数字？（是|否）");
        String respond2 = sc.nextLine();
        int[] arr2 = {1,2,3};//原数组
        String respond22;//if循环中是否删除数字的判断
        //判断是否删除数字
        if (respond2.equals(respondone)){
            do {
                int[] arrReduce = new int[arr2.length - 1];//创建新数组去接收删去一项内容的数组
                for (int i = 0; i < arr2.length - 1; i++) {
                    arrReduce[i] = arr2[i];
                }
                arr2 = arrReduce;//新数组赋值给原数组
                System.out.println("打印数组：");
                for (int i = 0; i < arr2.length; i++) {//打印删除后的数组
                    System.out.print(arr2[i]+" ");
                }
                if (arr2.length == 1){//防止数组被删除清空
                    System.out.println("\n数组内部仅剩一值");
                    break;
                }
                System.out.println("\n是否继续删除数字？（是|否）");
                respond22 = sc.nextLine();
            }while (respond22.equals(respondone));
        }
        System.out.println("结束删除");
    }
}
