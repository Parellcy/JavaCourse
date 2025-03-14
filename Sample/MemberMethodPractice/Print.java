package Sample.MemberMethodPractice;

class Print {
    public void rectangleStringPrint(int wide, int height, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wide; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }//长方形打印
}
