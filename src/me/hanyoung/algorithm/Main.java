package me.hanyoung.algorithm;

import java.util.Map;
import java.util.Scanner;

public class Main {

    static int limit, max = Integer.MIN_VALUE;
    static int[] scores, times;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        limit = in.nextInt();
        scores = new int[n+1];
        times = new int[n+1];
        for(int i = 1; i <= n; i++) {
            scores[i] = in.nextInt();
            times[i] = in.nextInt();
        }
        DFS(1, 0, 0);
        System.out.println(max);
    }

    private static void DFS(int idx, int sum, int time) {
        if(time > limit) return;
        if(max < sum) max = sum;
        if(idx == scores.length) return;
        DFS(idx+1, sum+scores[idx], time+times[idx]);
        DFS(idx+1, sum, time);
    }
}
