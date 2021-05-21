package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = solution(n, arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 1; i <= n; i++) {
            if(tmp[i] > arr[i]) {
                answer[1] = i;
            } else if(tmp[i] < arr[i]) {
                answer[0] = i;
            }
        }

        return answer;

    }
}
