package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    static int[] fibo;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        fibo = new int[n+1];
        solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    private static int solution(int n) {
        if(fibo[n] > 0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        if(n == 2) return fibo[n] = 1;
        return fibo[n] = solution(n-2) + solution(n-1);
    }
}
