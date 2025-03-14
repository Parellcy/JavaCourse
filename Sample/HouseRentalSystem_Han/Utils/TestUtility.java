package Sample.HouseRentalSystem_Han.Utils;

public class TestUtility {
    public static void main(String[] args) {
        //这是一个测试类，使用完毕，就可以删除了

        //要求输入一个字符串，长度最大为3
        System.out.println("==========");
        System.out.println("请输入字符串：");
        String s1 = Utility.readString(3);
        System.out.println("s1 = " + s1);

        //要求输入一个字符串，长度最大为10，如果用户直接回车，给一个默认值
        //该默认值无长度限制
        System.out.println("==========");
        System.out.println("请输入字符串：");
        String s2 = Utility.readString(3,"abaabaabaaba");
        System.out.println("s2 = " + s2);
    }
    /*
    调用的方法都是类.方法()
    因为当一个方法用static修饰时，该方法是一个静态方法
    静态方法可以直接通过类名调用，具体细节之后详解
    class 类名 {
        访问修饰符 static void/数据类型 方法名(参数列表) {
            方法体
        }
    }
     */



}
