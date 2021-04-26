package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int solution(String s) {
        String onlyNumbersStr = s.replaceAll("[^0-9]", "");
        while (onlyNumbersStr.indexOf('0') == 0) {
            onlyNumbersStr = onlyNumbersStr.replaceFirst("[0]", "");
        }
        return Integer.parseInt(onlyNumbersStr);

    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String inputStr = in.next();
        System.out.println(solution(inputStr));
    }
}
