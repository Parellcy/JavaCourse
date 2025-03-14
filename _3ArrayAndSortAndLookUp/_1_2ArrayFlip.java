package _3ArrayAndSortAndLookUp;

public class _1_2ArrayFlip {
    public static void main(String[] args) {
        //数组首尾互换

        //{11,22,33,44,55}->{55,44,33,22,11}
        //方法一
        //通过创建中间项接收内容使首尾互换
        System.out.println("==========");
        int[] arr1 = {11,22,33,44,55};

        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        //{11,22,33,44,55}->{55,44,33,22,11}
        //方法二
        //创建一个新的数组去反向接收原数组的内容
        //然后原数组去接收新数组的内容
        System.out.println("\n==========");
        int[] arrone = {11,22,33,44,55};
        int[] arrtwo = new int[arrone.length];
        for (int i = 0; i < arrone.length; i++) {
            arrtwo[i] = arrone[arrone.length - i - 1];

        }
        for (int i = 0; i < arrone.length; i++) {
        arrone[i] = arrtwo[i];
        }
        for (int i = 0; i < arrone.length; i++) {
            System.out.print(arrone[i] + " ");
        }
    }
}
