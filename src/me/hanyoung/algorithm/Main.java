package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int[][] maze, dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static boolean[][] checks = new boolean[9][9];

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        maze = new int[8][8];

        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= 7; j++) {
                maze[i][j] = in.nextInt();
            }
        }
        int result = DFS(1, 1);
        System.out.println(result);
    }

    private static int DFS(int x, int y) {
        if(x == 0 || y == 0) return 0;
        if(x == 8 || y == 8) return 0;
        if(maze[x][y] == 1) return 0;
        if(x == 7 && y == 7) return 1;
        else {
            checks[x][y] = true;
            int sum = 0;
            for (int[] dir : dirs) {
                if(!checks[x+dir[0]][y+dir[1]])
                    sum += DFS(x + dir[0], y + dir[1]);
            }
            checks[x][y] = false;
            return sum;
        }
    }
}
