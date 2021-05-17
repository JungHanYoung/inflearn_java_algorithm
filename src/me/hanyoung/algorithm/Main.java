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
        for (int value :
                arr) {
            System.out.print(value + " ");
        }
    }

    private static void solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
