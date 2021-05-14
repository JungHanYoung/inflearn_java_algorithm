package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            int m = 1;
            if(!check[i]) {
                answer++;
                while(i * m <= n) {
                    check[i * (m++)] = true;
                }
            }
        }
        return answer;
    }
}
