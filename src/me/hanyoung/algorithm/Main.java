package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String result = solution(n);
        System.out.println(result);
    }

    private static String solution(int n) {
        if(n == 0) return "";
        return "" + (n % 2) + solution(n / 2);
    }
}
