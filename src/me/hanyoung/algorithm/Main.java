package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int[] solution(int count) {
        int[] piboList = new int[count];

        piboList[0] = piboList[1] = 1;
        for (int i = 2; i < count; i++) {
            piboList[i] = piboList[i-2] + piboList[i-1];
        }

        return piboList;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] result = solution(in.nextInt());
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
