package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        solution(n, arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    private static void solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if(arr[j] > temp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1] = temp;
        }
    }
}
