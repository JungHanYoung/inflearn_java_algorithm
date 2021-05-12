package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = new char[str.length()+1];
        chars[str.length()] = ' ';
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if(chars[i] == chars[i+1]) cnt++;
            else {
                builder.append(chars[i]);
                if(cnt > 1) {
                    builder.append(cnt);
                }
                cnt = 1;
            }
        }
        return builder.toString();
    }
}
