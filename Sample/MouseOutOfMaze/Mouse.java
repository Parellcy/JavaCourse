package Sample.MouseOutOfMaze;

class Mouse {
    /*找到迷宫路线的方法
    找到了返回true，否则返回false
    maze为迷宫，[i,j]为老鼠所在位置
    老鼠初始位置为(1,1)
    由于通过 递归 方法找路，所以我们要找到退出递归的条件
        所以我们先规定maze的各个值的含义：
        0为无障碍，可以走
        1为有障碍，不可走
        2为可以走到目的地，是通路
        3为该路走过但走不通，是死路
    当目的地坐标变为2,是说明该路线是通路，否则就继续找

     */
    public void printWay(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean findWay1(int[][] maze, int i, int j) {
        if (maze[6][5] == 2) {//目的地设置
            return true;
        } else {
            if (maze[i][j] == 0) {
                //我们假定可以走通
                maze[i][j] = 2;
                //使用找路策略，来确定是否真的可以走通
                //下 -> 右 -> 上 -> 左 （逆时针）
                if (findWay1(maze, i + 1, j)) {//下
                    return true;
                } else if (findWay1(maze, i, j + 1)) {//右
                    return true;
                } else if (findWay1(maze, i - 1, j)) {//上
                    return true;
                } else if (findWay1(maze, i, j - 1)) {//左
                    return true;
                } else {
                    maze[i][j] = 3;
                    return false;
                }
            } else {// maze[i][j] == 1,2,3
                return false;
            }
        }
    }

    public boolean findWay2(int[][] maze, int i, int j) {
        if (maze[6][5] == 2) {//目的地设置
            return true;
        } else {
            if (maze[i][j] == 0) {
                //我们假定可以走通
                maze[i][j] = 2;
                //使用找路策略，来确定是否真的可以走通
                //下 -> 右 -> 上 -> 左 （逆时针）
                if (findWay2(maze, i - 1, j)) {//上
                    return true;
                } else if (findWay2(maze, i, j + 1)) {//右
                    return true;
                } else if (findWay2(maze, i + 1, j)) {//下
                    return true;
                } else if (findWay2(maze, i, j - 1)) {//左
                    return true;
                } else {
                    maze[i][j] = 3;
                    return false;
                }
            } else {// maze[i][j] == 1,2,3
                return false;
            }
        }
    }
}
