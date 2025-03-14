package _1JavaSummarize_Variable_Operator;
//单行注释
/*
多行注释
 */
/*文档注释
 注释内容可以被JDK提供的工具javadoc所解析
 生成一套以网页文件形式体现的该程序的说明文档
 一般写在类
 对类提供相关的信息，采用文档注释
 */
 /**
  * @author Parellcy
  * @version 1.0
  * @see
  * @see
  * @since
 */
 /*
 javadoc -d 文件夹名 -xx -yy ？？.java
 文件夹名为javadoc运行完之后所生成的文件的存放位置
 可打开index.html进行查看
 -xx -yy 对应的是所写的@的内容
 ？？为源文件名
 例： javadoc -d d:\\step -author -version Comments.java
 */
public class Annotation {
    public static void main(String[] args) {
        System.out.print("注释");
    }
}
