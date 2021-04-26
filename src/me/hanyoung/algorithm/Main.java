package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String solution(String s) {
        char[] chars = s.toCharArray();
        int lt=0, rt=s.length()-1;

        while(lt<rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String inputStr = in.next();
        String solution = solution(inputStr);
        System.out.println(solution);
//        char inputChar = in.next().charAt(0);
//        System.out.println("inputStr : " + inputStr);
//        System.out.println("inputChar : " + inputChar);
    }
}
