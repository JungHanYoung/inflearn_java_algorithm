package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int[][] arr = new int[num+1][6];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int result = solution(num, arr);
        System.out.println(result);
    }

    private static int solution(int num, int[][] arr) {
        int answer=0, max=Integer.MIN_VALUE;
        for (int i = 1; i <= num; i++) {
            int cnt = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
