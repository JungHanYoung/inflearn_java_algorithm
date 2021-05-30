package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {
    static int answer = 0;
    static int n;
    static int m;
    static int[][] graph;
    static int[] ch;


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 1; i <= m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            graph[x][y] = 1;
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

    private static void DFS(int v) {
        if(v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
