package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int[] arr;
    static int N, M;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        arr = new int[M];
        DFS(0, 1);
    }

    private static void DFS(int l, int s) {
        if(l == M) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = s; i <= N; i++) {
                arr[l] = i;
                DFS(l+1, i+1);
            }
        }
    }
}
