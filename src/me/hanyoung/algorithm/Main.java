package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int[][] arr;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        arr = new int[n+1][r+1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= r; j++) {
                arr[i][j] = -1;
            }
        }
        int result = DP(n, r);
        System.out.println(result);
    }

    private static int DP(int n, int r) {
        if(n == r || r == 0) {
            return 1;
        } else if(arr[n][r] > 0) {
            return arr[n][r];
        } else {
            arr[n-1][r-1] = DP(n-1, r-1);
            arr[n-1][r] = DP(n-1, r);
            return arr[n-1][r-1] + arr[n-1][r];
        }
    }
}
