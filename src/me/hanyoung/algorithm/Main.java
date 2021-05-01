package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int solution(int n, int[] arr) {
        int answer = 0;

        int add = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                answer += add;
                add++;
            } else {
                add = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int result = solution(n, arr);
        System.out.println(result);

    }
}
