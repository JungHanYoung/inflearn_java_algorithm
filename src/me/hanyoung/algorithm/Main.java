package me.hanyoung.algorithm;

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
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }
        int answer = sum;
        for (int i = m; i < n; i++) {
            sum += arr[i];
            sum -= arr[i-m];
            if(sum > answer) answer = sum;
        }

        return answer;
    }
}
