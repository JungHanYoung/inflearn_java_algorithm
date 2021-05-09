package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int result = solution(n, m, arr);
        System.out.println(result);
    }

    private static int solution(int n, int m, int[][] arr) {
        // n: 학생수, m: 시험을 치른 횟수,
        // arr: 각 시험마다의 학생들의 등수가 저장될 배열
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // i - 멘토, j - 멘티
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if(arr[k][l] == i) pi = l;
                        if(arr[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }
}
