package _1JavaSummarize_Variable_Operator;

public class HelloWorld {
    public static void main(String[] args) {//程序执行的入口
        System.out.println("Hello World!");
    }
}
//public class AB{
//    //类 'AB' 为 public，应在文件 'AB.java' 中声明
//}
//class AB{
//
//}

//一个源文件中最多只有一个public类，其他数量不限
//编译后，源文件中每一个类都会有对应的.class文件
//如果源文件中包含一个public类，则文件名必须以和该类名相同
//类、方法的注释要以javadoc的方式来写
//shift+tap整体左移
//行宽度不要超过80字符
//运算符和等号两侧习惯性空格隔开

/*dos命令（了解）：磁盘操作系统
基本原理：在cmd写下的指令运行将会发送给dos系统，dos系统接收解析执行
*/
/*dos命令
dir 路径：查看当前路径下有什么
cd /D c：切换盘
cd ..：切换到上一级
cd /：切换到根目录
md 路径：在该路径新建目录
rd 路径:：删除该路径的目录
tree 路径：查看该路径下的所以子目录
cls：清屏
exit：退出cmd
copy 路径1 路径2：复制路径1的文件到路径2上
move 路径1 路径2：剪切路径1的文件到路径2上
del 路径：删除该路径的文件
echo ???(内容) > ???(文件名).txt：创建一个带有内容的文件
type nul > ???(文件名).txt：创建空文件
*/

/*相对、绝对路径
相对：从当前目录开始定位
绝对：从顶级目录开始定位
例：
    D盘
        abc1文件夹
            test100文件夹
            test200文件夹
        abc2文件夹
            test300文件夹
            test400文件夹
                hello.txt
假如我在test100文件夹下，则相对路径从test100目录开始定位
    我想定位到test400文件夹下的txt文件
    相对路径：..\（abc1）..\（D盘）abc2\test400\hello.txt
    ..\：指到上一级目录
    绝对路径：d:\abc2\test400\hello.txt
*/

/*变量：程序的基本组成单位
类型+名称+值
在同一个作用域中不能重名
该区域的数据可以在同一类型范围内不断变化
 */

/*数据类型
基本数据类型+引入数据类型（类、接口、数组）
byte1；short2；int4；long8；
float4；double8；
char2；
boolean1：true/false；
 */