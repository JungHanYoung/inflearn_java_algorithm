package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int solution(String s, char c) {
        int total = 0;
        String upperStr = s.toUpperCase();
        char upperChar = Character.toUpperCase(c);
        for (int i = 0; i < upperStr.length(); i++) {
            if(upperStr.charAt(i) == upperChar) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String inputStr = in.next();
        char inputChar = in.next().charAt(0);
//        System.out.println("inputStr : " + inputStr);
//        System.out.println("inputChar : " + inputChar);
        int actualResult = solution(inputStr, inputChar);
        System.out.println(actualResult);
    }
}
