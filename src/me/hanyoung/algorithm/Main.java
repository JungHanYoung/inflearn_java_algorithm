package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(n, m, arr);
        System.out.println(result);
    }

    private static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(arr[i] == m) return i + 1;
        }

        return -1;
    }
}
