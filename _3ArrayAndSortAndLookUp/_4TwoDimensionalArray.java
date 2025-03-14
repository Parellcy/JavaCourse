package _3ArrayAndSortAndLookUp;

public class _4TwoDimensionalArray {
    public static void main(String[] args) {
        //二维数组

        /*
        请用二维数组输出以下图形
         0 0 0 0 0 0
         0 0 1 0 0 0
         0 2 0 3 0 0
         0 0 0 0 0 0
         */
        /*使用方式：动态初始化
        1.int[][] arr = new int[4][6]
        2.int[][] arr;arr = new int[4][6]
         */
        System.out.println("==========");
        int[][] arr1 = { { 0,0,0,0,0,0 },
                         { 0,0,1,0,0,0 },
                         { 0,2,0,3,0,0 },
                         { 0,0,0,0,0,0 }
                       };//静态初始化
        //打印图形
        for (int i = 0; i < arr1.length; i++) {//arr[i]表示二维数组的第i个元素
            for (int j = 0; j < arr1[i].length; j++) {//arr[i].length表示二维数组中对应每个一维数组的长度
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        /*使用方式：列数不确定
         1
         2  2
         3  3  3
         */
        //要求：求出所有元素的总和
        System.out.println("==========");
        int[][] arr2 = new int[3][];
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            //为每一个一维数组开空间
            arr2[i] = new int[i + 1];
            /*例：帮助一维数组开空间
            如若没有为一维数组开空间，则arr2[]就是null
            arr = new int[?];   与二维数组对比理解
            arr2[?] = new int[?];    arr2为二维数组，arr2[?]为二维数组中的一维数组
             */
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + 1;//此处若为j + 1;则1结果为1;  1,2;    1,2,3;
                sum = sum + arr2[i][j];
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("总和为"+sum);
    }
}
/*二维数组
    int[][]
1.定义：原来的一维数组的每个元素一一维数组，就构成二维数组
2.访问
如果我们要访问第（i+1）个一维数组的第（j+1）个值：arr[i][j]
例：访问3：arr[2][3]
3.使用方式
动态初始化：
类型[][] 数组名 = new 类型[大小][大小];
赋值（存在默认值）

动态初始化：
类型[][] 数组名;//先声明
数组名 = new 类型[大小][大小];//再定义
赋值（存在默认值）

列数不确定：
类型[][] 数组名 = new 类型[大小][];

静态初始化
类型[][] 数组名 = { { 值1,值2,值3,值3...}, {...}, {...}, {...}...}
注意：例int arr = { {1},{1,2},3};报错，原因在于3并非int[]类型
4.内存布局
栈：arr->0x1100
堆：0x1100{0x0010,0x0020,0x0030,0x0040}   地址内存放地址，地址内地址指向自身
ox0010{0,0,0,0,0,0},0x0020{0,0,1,0,0,0},0x0030{0,2,0,3,0,0},0x0040{0,0,0,0,0,0}
 */