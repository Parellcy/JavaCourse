package Sample.EightQueensProblem;

class Queen {
    public void solveProblem(int[][] chessboard, int x, int y) {


    }

    public void forbidQueen(int[][] chessboard, int x, int y) {
        for (int i = 0; i < 8; i++) {
            chessboard[i][y] = 2;
        }//改变皇后列的值
        for (int i = 0; i < 8; i++) {
            chessboard[x][i] = 2;
        }//改变皇后行的值
        chessboard[x][y] = 1;
        for (int i = 1; i < chessboard.length; i++) {
            if (x == 0) {
                if (y == 0) {
                    chessboard[x + i][y + i] = 2;
                } else if (y == 7) {
                    chessboard[x + i][y - i] = 2;
                } else if (y >= 1 && y <= 6) {
                    chessboard[x + i][y - i] = 2;
                    chessboard[x + i][y + i] = 2;
                }
            } else if (x == 7) {
                if (y == 0) {
                    chessboard[x - i][y + i] = 2;
                } else if (y == 7) {
                    chessboard[x - i][y - i] = 2;
                }
            }
        }//改变皇后斜的值
        //皇后位置初始化
        chessboard[x][y] = 1;//x，y代表所放第一个皇后的初始位置
    }

    public void printChessboard(int[][] chessboard) {
        System.out.println("==========");
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
