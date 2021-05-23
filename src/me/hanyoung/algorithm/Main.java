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
        if(n == 1) return 1;
        return n * solution(n-1);
    }
}
