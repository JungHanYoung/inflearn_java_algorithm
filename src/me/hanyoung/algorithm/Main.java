package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int[] result = solution(n, arr);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < n; i++) {
            answer[i] = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;
                if(arr[i] < arr[j]) answer[i]++;
            }
        }

        return answer;
    }


}
