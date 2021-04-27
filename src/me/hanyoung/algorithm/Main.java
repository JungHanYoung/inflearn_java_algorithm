package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void solution(int[] list) {
        int target = 0;
        for (int j : list) {
            if (target < j) {
                System.out.print(j + " ");
            }
            target = j;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] list = new int[in.nextInt()];
        for(int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        solution(list);
    }
}
