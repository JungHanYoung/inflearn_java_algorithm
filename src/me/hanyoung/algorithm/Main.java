package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = solution(s, n, arr);
        for (int x :
                result) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for (int val : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if(cache[i] == val) pos = i;
            }
            for (int i = pos == -1 ? s-1 : pos; i >= 1; i--) {
                cache[i] = cache[i-1];
            }
            cache[0] = val;
        }
        return cache;
    }
}