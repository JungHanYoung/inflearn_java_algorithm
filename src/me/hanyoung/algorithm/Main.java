package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int[] arr;
    static int c;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        c = in.nextInt();
        int count = in.nextInt();
        arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        DFS(0, 0);
        System.out.println(max);
    }

    private static void DFS(int idx, int sum) {
        if(sum <= c) {
            if(sum > max) {
                max = sum;
            }
            if(idx == arr.length) {
                return;
            }
            DFS(idx+1, sum + arr[idx]);
            DFS(idx+1, sum);
        }
    }
}
