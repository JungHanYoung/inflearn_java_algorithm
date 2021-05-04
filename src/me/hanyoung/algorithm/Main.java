package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int length = in.nextInt();
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int result = solution(length, matrix);
        System.out.println(result);
    }

    private static int solution(int length, int[][] matrix) {
        int answer = 0;
        int[][] map = new int[length+2][length+2];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                map[i+1][j+1] = matrix[i][j];
            }
        }

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if(map[i][j] > map[i-1][j] &&
                map[i][j] > map[i][j-1] &&
                map[i][j] > map[i+1][j] &&
                map[i][j] > map[i][j+1]) answer++;
            }
        }

        return answer;
    }
}
