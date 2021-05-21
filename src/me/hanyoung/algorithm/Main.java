package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        String result = solution(n, arr);
        System.out.println(result);
    }

    private static String solution(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }

        return "U";
    }
}
