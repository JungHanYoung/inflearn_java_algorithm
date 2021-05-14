package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = solution(len, arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] solution(int len, int[] arr) {
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = 1;
            for (int j = 0; j < len; j++) {
                if(arr[i] < arr[j]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
