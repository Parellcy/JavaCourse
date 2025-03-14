package _2ControlStructure;

public class Continue {
    public static void main(String[] args) {
        Label1:
        for (int i = 1; i < 5; i++) {
            Label2:
            for (int j = 1; j < 5; j++) {
                if (j == 3) {
                    //continue;与continue Label2;相同
                    //continue Label1;
                    continue Label2;
                }
                System.out.println("j:" + j);
            }
            System.out.println("i:" + i);
        }
    }
}
/*continue
用于结束本次循环，继续执行下一循环

        {
        ...
        continue;
        ...
    }

类似break，可以使用标签决定结束哪次循环
 */
