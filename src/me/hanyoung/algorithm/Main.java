package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int M, N;
    static int[][] box;
    static Queue<int[]> queue = new LinkedList<>();
    private static final int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        box = new int[N][M];
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = in.nextInt();
                if(box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        System.out.println(BFS());
    }

    private static int BFS() {
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                for (int[] dir : dirs) {
                    int x = poll[0] + dir[0];
                    int y = poll[1] + dir[1];
                    if(isExistTomato(x, y) && !isRipeTomato(x, y)) {
                        box[x][y] = 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
            count++;
        }
        if(existNotRipeTomato()) return -1;
        return count - 1;
    }

    private static boolean isExistTomato(int x, int y) {
        if(x < 0 || y < 0 || x >= N || y >= M) return false;
        return box[x][y] != -1;
    }

    private static boolean isRipeTomato(int x, int y) {
        return box[x][y] == 1;
    }

    private static boolean existNotRipeTomato() {
        for(int x = 0; x < box.length; x++) {
            for(int y = 0; y < box[0].length; y++) {
                if(box[x][y] == 0) return true;
            }
        }
        return false;
    }
}
