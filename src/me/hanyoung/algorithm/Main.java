package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        if(n == 0) return;
        solution(n - 1);
        System.out.print(n + " ");
    }
}
