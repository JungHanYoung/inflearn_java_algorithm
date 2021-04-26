package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static boolean solution(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        int lt=0, rt=s.length()-1;

        while(lt<rt) {
            if(chars[lt] != chars[rt]) return false;
            lt++;
            rt--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String inputStr = in.next();
        if(solution(inputStr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
