package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[][] matrix = new int[input1][input1];

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int result = solution(input1, matrix);
        System.out.println(result);
    }

    private static int solution(int length, int[][] matrix) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                sum += matrix[i][j];
            }
            if(maxValue < sum) maxValue = sum;
        }
        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                sum += matrix[j][i];
            }
            if(maxValue < sum) maxValue = sum;
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += matrix[i][i];
        }
        if(maxValue < sum) maxValue = sum;
        sum = 0;
        for (int i = 0; i < length; i++) {
            sum += matrix[i][length-i-1];
        }
        if(maxValue < sum) maxValue = sum;
        return maxValue;
    }
}
