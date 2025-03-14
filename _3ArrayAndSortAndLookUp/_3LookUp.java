package _3ArrayAndSortAndLookUp;

import java.util.Scanner;

public class _3LookUp {
    public static void main(String[] args) {
        //数组查找

        //顺序查找
        System.out.println("==========");
        String[] arr1 = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        System.out.println("请输入要查找的名称");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean arrone = false;
        for (int i = 0; i < arr1.length; i++) {
            if (name.equals(arr1[i])) {
                System.out.println("该名称位于数组第"+(i+1)+"位，"+"索引为"+i);
                arrone = true;
                break;
            }
        }
        if (arrone == false){
            System.out.println("没有这个名称");
        }

        //二分查找，例【35】
        //第一次查找1,8,35,85,258,539
        //第二次查找1,8,35,
        //第三次查找35
        System.out.println("==========");
        int[] arr = {1,8,35,85,258,539};
        //定义需要查询的值
        System.out.println("需要查询的值:");
        int select_value = sc.nextInt();
        int index= getIndex(arr,select_value);
        System.out.println("查询值所对应的索引为：" + index);
    }
    //创建get方法于main之外class之内
    public static int getIndex(int[] arr,int select_value) {
        //初始化最小值的索引为0
        int left = 0;

        //初始化最大值的索引为arr.length-1
        int right = arr.length - 1;

        //首尾相加再除以2得出中间索引
        int mid = (left + right) / 2;

        while (left <= right) { //确保程序不会重复查询，不会越界
            if (select_value > arr[mid]) {
                //如果查询的值比中间值大，则往右边区域找，就把最小索引改为中间索引右移一位
                left = mid + 1;
            } else if (select_value < arr[mid]) {
                //如果查询的值比中间值小，则往左边区域找，就把最大索引改为中间索引左移一位
                right = mid - 1;
            } else {
                //剩余的情况就是查询到了结果，那么就直接返回索引。
                return mid;
            }
            mid = (left + right) / 2;
        }
        //没有查询到，则返回-1
        return -1;
    }
}
/*顺序查找
例：有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏
从键盘中任意输入一个名称，判断数列中是否包含此名称
要求：如果找到了，提示找到了，并给出下标值
如果没有就提示“没有这个名称”
 */

/*二分查找
对于一个有序整型数组进行二分查找
见
https://blog.csdn.net/select_myname/article/details/125684252?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171680870316800226545958%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=171680870316800226545958&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-2-125684252-null-null.142^v100^control&utm_term=java%E4%BA%8C%E5%88%86%E6%B3%95%E6%9F%A5%E6%89%BE&spm=1018.2226.3001.4187
详解
 */
