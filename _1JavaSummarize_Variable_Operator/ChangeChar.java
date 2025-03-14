package _1JavaSummarize_Variable_Operator;
/*转义字符
\t:一个制表位，实现对齐
\n:换行
\\:一个\
\":一个"
\':一个'
\r:回车
*/
public class ChangeChar {
    public static void main(String[] args) {
        System.out.println("==========");
        System.out.print("北京\t南京\t西京\t东京\n");
        System.out.println("==========");
        System.out.print("北京\\南京\\西京\\东京\n");
        System.out.println("==========");
        System.out.print("北京\"南京\"西京\"东京\n");
        System.out.println("==========");
        System.out.print("北京\'南京\'西京\'东京\n");
        System.out.println("==========");
        System.out.print("北京南京西京\r东京");
        //在\r后有新内容时,会先删除之前以前存在过的文本,即只打印\r后面的内容

    }
}
