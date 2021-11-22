package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M, min = Integer.MAX_VALUE;
    static int[] arr;
    static boolean[] checks;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];
        checks = new boolean[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int M = in.nextInt();
        System.out.println(DFS(0, M));
    }

    private static int DFS(int cnt, int remain) {
        if(remain == 0) {
            return cnt;
        } else {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if(checks[i]) continue;
                checks[i] = true;
                min = Math.min(min, DFS(cnt + (remain / arr[i]), remain % arr[i]));
                checks[i] = false;
            }
            return min;
        }
    }
}
