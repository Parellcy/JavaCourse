package _3ArrayAndSortAndLookUp;

public class _2Sort {

    public static void main(String[] args) {
        //数组排序

        //冒泡排序法
        //五个无序数据：24，69，80，57，13
        //按冒泡排序排成从小到大
        int[] arr = { 24, 69, 80, 57, 13 };
        //从下标小的数值开始跟下标大的数值比较
        //如果下标小的数值大于下标大的数值，两者交换位置
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println("第" + (i + 1) + "轮，第" + (j - i) + "次交换");
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        //从下标大的数值开始跟下标小的数值比较
        //如果下标大的数值小于下标小的数值，两者交换位置
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int k = 0; k < arr.length; k++) {
//            System.out.print(arr[k]+" ");
//        }
    }
}
/*排序
是将多个数据，依照指定的顺序进行排列的过程
1.内部排序法
将需要处理的所有数据都加载到内部存储器中进行排序
包括交换式排序法、选择式排序法、插入式排序法
2.外部排序法
数据量过大，无法全部加载到内存中
需要借助外部存储进行排序
包括合并排序法、直接合并排序法
 */

/*冒泡排序法
基本思想：通过对待排序序列从后向前（从下标较大的元素开始）
依次比较相邻的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部
 */