package Sample.MonkeyEatsPeach;

public class Main {
    public static void main(String[] args) {
        /*
        猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个
        第二天早上又将剩下的桃子吃掉一半，又多吃了一个
        以后每天早上都吃前一天剩下的一半零一个
        到第10天早上想再吃时，见只剩下一个桃子了
        求第一天共摘多少个桃子？
         */
        /*逆推
        day = 10;   1
        day = 9;    4
        day = 8;   10
        day = 7;   22
        day = 6;   46
        ...
        day = 10;  1534
         */
        Monkey m = new Monkey();
        System.out.println(m.Peach(10,1));
    }
}
