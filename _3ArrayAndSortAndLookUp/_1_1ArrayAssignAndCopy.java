package _3ArrayAndSortAndLookUp;

public class _1_1ArrayAssignAndCopy {
    public static void main(String[] args) {
        //数组

        //值传递
        System.out.println("==========");
        int n1 = 10;
        int n2 = n1;
        n2 = 30;

        System.out.println("n1:"+n1);
        System.out.println("n2:"+n2);

        //数组赋值机制
        System.out.println("==========");
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 4;
        System.out.println("arr2数组:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        //数组拷贝，实现独立性，互不干扰
//        栈：arr1->地址0x0011，arr2->地址0x0022
//        堆：地址0x0011{10，20，30}，地址0x0022{0，0，0}

//        地址0x0011中的值 赋值 给地址0x0022中的值
//        改变地址地址0x0011中的值

//        堆：地址0x0011{40，20，30}，地址0x0022{40，20，30}，
        System.out.println("\n==========");
        int[] arrOne = {10,20,30};
        int[] arrTwo = new int[arrOne.length];

        for (int i = 0; i < arrOne.length; i++) {
            arrTwo[i] = arrOne[i];
        }//copy赋值arr2
        arrOne[0] = 40;
        System.out.println("arrOne数组:");
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i]+" ");
        }
        System.out.println("\narrTwo数组:");
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print(arrTwo[i]+" ");
        }
    }
}
/*Array
1.数组可以存放多个同一类型的数据
也是一种数据类型（引用类型）

    1.数组的定义
    数据类型[] 数组名称 = new 数据类型[数组大小（可以存放多少数据）]
    2.动态初始化
    数据类型[] 数组名称;  //声明数组
    数组名称 = new 数据类型[数组大小（可以存放多少数据）];  //创建数组
    3.静态初始化
    数据类型 数组名称[] = {元素值,元素值,元素值,元素值,元素值,元素值};

2.下标/索引
    数据类型 数组名称[] = {?,?,?,?,?,?,?,?,?};
                     0 1 2 3 4 5 6 7 8      ：下标
通过名称[下标]选择其中某一组数据
3.注意
数组是多个相同数据类型的集合，便于统一控制
对于数据类型可以是基本类型/引用类型，但同一数组内必须统一
数组建立后，若没有赋值，则有默认值（int/short/byte/long/float/double 0;）
                             （char \u0000;boolean false;string null;）
数组的下标从0开始
数组的下标必须在指定范围内使用，否则出现下标越界异常
数组属于引用类型，数组型数据为对象（object）
 */

/*数组赋值机制
jvm的内存：栈、堆、方法区
数组在默认情况下是引用传递，赋的值是地址
1.值传递
栈：n1->[10]，n2->[20]

栈：n1->[10]，n2->[30]
2.引用传递
栈：arr1->地址0x0011，arr2->地址0x0011
堆：地址0x0011{1，2，3}

改变地址0x0011中的arr2[0]=4;即改变了arr1[0]的值

堆：地址0x0011{4，2，3}
arr1仍然指向地址0x0011
*/
