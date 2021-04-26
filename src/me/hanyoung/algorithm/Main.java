package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean solution(String s) {
        String str = s.toUpperCase().replaceAll("[^A-Z]", "");
        return new StringBuilder(str)
                .reverse()
                .toString()
                .equals(str);
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String inputStr = in.nextLine();
        if(solution(inputStr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
