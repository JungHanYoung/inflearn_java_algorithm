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
        // n: 배열 길이, m: 연속수열의 합 체크 값, arr: 배열
        int lt = 0, rt = 0, sum = 0, answer = 0;
        sum += arr[rt++];
        if(sum == m) answer++;
        while(rt < n || sum >= m) {
            if(sum < m) {
                sum += arr[rt++];
            } else if(sum > m) {
                sum -= arr[lt++];
            } else {
                answer++;
                sum -= arr[lt++];
            }
        }

        return answer;
    }
}
