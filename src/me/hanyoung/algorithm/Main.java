package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String inputStr = in.next();
        //        System.out.println("inputStr : " + inputStr);
        //        System.out.println("inputChar : " + inputChar);
        String result = solution(inputStr);
        System.out.println(result);
    }
}
