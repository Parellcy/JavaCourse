package Sample.EightQueensProblem;

public class Main {
    public static void main(String[] args) {
        //待解决
        /*八皇后问题
             0 1 2 3 4 5 6 7 y
           0 0 0 0 0 0 0 0 0
           1 0 0 0 0 0 0 0 0
           2 0 0 0 0 0 0 0 0
           3 0 0 1 0 0 0 0 0
           4 0 0 0 0 0 0 0 0
           5 0 0 0 0 0 0 0 0
           6 0 0 0 0 0 0 0 0
           7 0 0 0 0 0 0 0 0
           x
         */
        int[][] chessboard = new int[8][8];
        //默认值为0，当放上一名皇后，皇后所在的位置改为1
        //所以被皇后影响的数值改为2，代表不可存放
        Queen queen = new Queen();
        //打印初始棋盘
        queen.printChessboard(chessboard);
        queen.forbidQueen(chessboard,0,2);
        //解决八皇后问题
//        queen.solveProblem(chessboard,0,0);
        //打印八皇后棋盘
        queen.printChessboard(chessboard);
    }
}
