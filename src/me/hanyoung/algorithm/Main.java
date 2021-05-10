package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        int[] result = solution(n, arr1, m, arr2);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] solution(int n, int[] arr1, int m, int[] arr2) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ni = 0, mi = 0;
        while(ni < n && mi < m) {
            if(arr1[ni] < arr2[mi]) {
                ni++;
            } else if(arr1[ni] > arr2[mi]) {
                mi++;
            } else {
                answerList.add(arr1[ni]);
                ni++;
                mi++;
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
