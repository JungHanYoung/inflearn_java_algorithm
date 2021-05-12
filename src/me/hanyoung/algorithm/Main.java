package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        char[] chars = str.toCharArray();
        int lt = 0, rt = chars.length - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else if(Character.toLowerCase(chars[lt++]) != Character.toLowerCase(chars[rt--])) {
                return "NO";
            }
        }
        return "YES";
    }
}