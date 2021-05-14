package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }
        int[] result = solution(n1, arr1, n2, arr2);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int n1, int[] arr1, int n2, int[] arr2) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int i1 = 0, i2 = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i1 < n1 && i2 < n2) {
            if(arr1[i1] == arr2[i2]) {
                answerList.add(arr1[i1]);
                i1++;
                i2++;
            } else if(arr1[i1] < arr2[i2]) {
                i1++;
            } else {
                i2++;
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
