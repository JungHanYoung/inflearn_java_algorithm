package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(n, k, arr);
        System.out.println(result);
    }

    private static int solution(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(rt-lt >= k) {
                sum -= arr[lt];
                lt++;
            }
            if(answer < sum) answer = sum;
        }
        return answer;
    }
}
