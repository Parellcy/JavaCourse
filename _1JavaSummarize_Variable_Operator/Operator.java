package _1JavaSummarize_Variable_Operator;

public class Operator {
    public static void main(String[] args) {
        //逻辑运算符

        System.out.println("==========");
        int x;
        int y;
        x = 5;
        y = 5;
        //先判断再++
        if (x++==6 & y++==6){
            x=11;
        }
        System.out.println("x="+x+",y="+y);
        x = 5;
        y = 5;
        if (x++==5 | y++==5){
            x=11;
        }
        System.out.println("x="+x+",y="+y);
        x = 5;
        y = 5;
        if (x++==6 && y++==6){
            x=11;
        }
        System.out.println("x="+x+",y="+y);
        x = 5;
        y = 5;
        if (x++==5 || y++==5){
            x=11;
        }
        System.out.println("x="+x+",y="+y);

        //三元运算符
        System.out.println("==========");
        int a;
        int b;
        int c;
        a=55;
        b=47;
        c=68;
        int max1;
        int max2;
        max1=a>b?a:b;
        max2=max1>c?max1:c;
        System.out.println("max="+max2);
    }
}
/*关系运算符结果为布尔类型
==；>=；<=；!=；>；<；instanceof检查是否是类的对象
 */

/*逻辑运算符
逻辑与&；短路与&&；
逻辑或|；短路或||；
取反!；逻辑异或^；
a    b    a&b    a&&b    a|b    a||b    !a    a^b
t    t     t       t      t       t      f     f
t    f     f       f      t       t      f     t
f    t     f       f      t       t      t     t
f    f     f       f      f       f      t     f
a&b(a&&b)：a，b都为t
为t;a,b其中有一为f，为f；
a|b(a||b)：a，b其中有一为t，为t；a，b都为f，为f；
逻辑和短路的区别在于判断方式不同
!a：a为t，为f；a为f，为t；
a^b：a，b结果不同，为t；a,b结果相同，为f；
逻辑是从左到右全部判断
短路是能判断结果就停止
*/

/*三元运算符
条件表达式?表达式1:表达式2;
运算规则：
条件表达式为t，运算后的结果为表达式1
条件表达式为f，运算后的结果为表达式2
*/

/*位运算符
按位与&，按位或|（同逻辑与,短路与）
<<（算数左移），>>（算术右移），>>>（逻辑右移）
没有<<<符号
<<按二进制形式把所有的数字向左移动对应的位数，低位补零
例，3<<2即0000 0011成为0000 1100（12）
>>按二进制形式把所有的数字向右移动对应的位数，如果该数为正，则高位补0，若为负数，则高位补1
   15>>2即0000 1111成为0000 0011（3）
   18>>3即0001 1010成为0000 0011（3）
>>>：按二进制形式把所有的数字向右移动对应的位数，如果该数为正，则高位补0，若为负数，则高位补0
例，4>>>1即0000 0100成为0000 0010（2）
   -4>>>1，结果是2147483646
   -2>>>1，结果是2147483647
按位异或^：一个为0，一个为1，结果为1，否则为0
按位取反~：0->1；1->0
 */

/*机器数,真值
1、机器数
一个数在计算机中的二进制表示形式, 叫做这个数的机器数
机器数是带符号的，在计算机用一个数的最高位存放符号, 正数为0, 负数为1
比如，十进制中的数+3，计算机字长为8位，转换成二进制就是00000011。如果是-3，就是10000011
那么，这里的00000011和10000011 就是机器数
2、真值
为区别起见，将带符号位的机器数对应的真正数值称为机器数的真值
例:0000 0001的真值=+000 0001=+1
   1000 0001的真值=–000 0001=–1
*/

/*原码，反码，补码
1.原码
原码就是符号位加上真值的绝对值, 即用第一位表示符号, 其余位表示值
比如如果是8位二进制:
[+1]原=0 000 0001
[-1]原=1 000 0001
2.反码
反码的表示方法是：
正数的反码是其本身，
负数的反码是在其原码的基础上, 符号位不变，其余各个位取反
[+1]=[0 0000001]原=[0 0000001]反
[-1]=[1 0000001]原=[1 1111110]反
3.补码
补码的表示方法是:
正数的补码就是其本身，
负数的补码是在其原码的基础上, 符号位不变, 其余各位取反, 最后+1（即在反码的基础上+1）
[+1]=[0 0000001]原 = [0 0000001]反 = [0 0000001]补
[-1]=[1 0000001]原 = [1 1111110]反 = [1 1111111]补
4.
0的反码、补码都是0
 */
