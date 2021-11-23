package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] checks = new boolean[9][9];
    static int[][] maze = new int[8][8];
    static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = in.nextInt();
            }
        }
        queue.add(new int[]{1, 1});
        System.out.println(BFS());
    }

    private static int BFS() {
        int distance = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                int x = poll[0];
                int y = poll[1];
                if(x == 7 && y == 7) return distance;
                for(int[] dir : dirs) {
                    int dx = dir[0];
                    int dy = dir[1];
                    if(available(x+dx, y+dy)) {
                        checks[x+dx][y+dy] = true;
                        queue.add(new int[]{x+dx, y+dy});
                    }
                }
            }
            distance++;
        }
        return -1;
    }

    private static boolean available(int x, int y) {
        if(x == 0 || y == 0 ||
            x == 8 || y == 8) return false;
        else if(checks[x][y] || maze[x][y] == 1) return false;
        else return true;
    }
}
