package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int F, N;
    static boolean flag = false;
    static int[][] dp = new int[11][11];
    static int[] arr, p, checks;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        F = in.nextInt();
        arr = new int[N];
        p = new int[N];
        checks = new int[N+1];
        for(int i = 0; i < N; i++) {
            arr[i] = comb(N-1, i);
        }

        DFS(0, 0);
    }

    private static void DFS(int l, int sum) {
        if(flag) return;
        if(l == N) {
            if(sum == F) {
                for (int i : p) System.out.print(i + " ");
                flag = true;
            }
        } else {
            for(int i = 1; i <= N; i++) {
                if(checks[i] == 0) {
                    checks[i] = 1;
                    p[l] = i;
                    DFS(l+1, sum + (p[l] * arr[l]));
                    checks[i] = 0;
                }
            }
        }
    }

    private static int comb(int n, int r) {
        if(dp[n][r] > 0) return dp[n][r];
        if(n == r || r == 0) return 1;
        else return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
    }
}
