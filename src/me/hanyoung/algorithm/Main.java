package me.hanyoung.algorithm;

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
        for (int val :
                result) {
            System.out.print(val + " ");
        }
    }

    private static int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n+m];
        int ni = 0, mi = 0, answeri = 0;
        while(
                answeri < n + m &&
                        ni < n  &&
                        mi < m
        ) {
            if(arr1[ni] < arr2[mi]) {
                answer[answeri] = arr1[ni];
                ni++;
            } else {
                answer[answeri] = arr2[mi];
                mi++;
            }
            answeri++;
        }
        for (int i = ni; i < n; i++, answeri++) {
            answer[answeri] = arr1[i];
        }
        for (int i = mi; i < m; i++, answeri++) {
            answer[answeri] = arr2[i];
        }
        return answer;
    }
}
