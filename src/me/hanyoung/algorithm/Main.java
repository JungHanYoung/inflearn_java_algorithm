package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int N;
    static int[][] map, dirs = {
            {-1,-1},
            {-1,0},
            {-1,1},
            {0,-1},
            {0,1},
            {1,-1},
            {1,0},
            {1,1},
    };
    static boolean[][] check;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        map = new int[N][N];
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }
        System.out.println(countIsland());
    }

    private static int countIsland() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!check[i][j] && map[i][j] == 1) {
                    count++;
                    DFS(i, j);
                }
            }
        }
        return count;
    }

    private static void DFS(int x, int y) {
        if(x < 0 || y < 0 || x == N || y == N) return;
        if(check[x][y] || map[x][y] == 0) return;
        check[x][y] = true;
        for (int[] dir: dirs) {
            DFS(x+dir[0], y+dir[1]);
        }
    }
}
