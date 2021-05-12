package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(len, n, arr);
        System.out.println(result);
    }

    private static int solution(int len, int n, int[] arr) {
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < len; rt++) {
            if(arr[rt] == 0) {
                cnt++;
                while(cnt > n) {
                    if(arr[lt] == 0) {
                        cnt--;
                    }
                    lt++;
                }
            }
            if(answer < rt - lt + 1) answer = rt - lt + 1;
        }
        return answer;
    }
}
