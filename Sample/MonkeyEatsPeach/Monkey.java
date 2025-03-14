package Sample.MonkeyEatsPeach;

class Monkey {
    //day为第？天，pea为day天时猴子还未吃桃的数量
    //该方法返回猴子第一天摘了多少桃
    //此为通解
    public int Peach(int day, int peach) {
        int yesterday = day - 1;
        if (day == 1) {
            return peach;//返回第一天时桃子的数量
        } else if (yesterday >= 1) {
            int numberPeach = (peach + 1) * 2;
            return Peach(yesterday, numberPeach);
        } else {
            return -1;
        }
    }
}
