package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String apws = s + ' ';
        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            if(apws.charAt(i) == apws.charAt(i+1)) {
                cnt++;
            } else {
                sb.append(apws.charAt(i));
                if(cnt != 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
