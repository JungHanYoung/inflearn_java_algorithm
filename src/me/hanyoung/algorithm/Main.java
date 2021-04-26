package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String solution(String s) {
        String answerStr = "";
        String[] splitStrList = s.split(" ");
        for (String el : splitStrList) {
            if (answerStr.length() < el.length()) {
                answerStr = el;
            }
        }
        return answerStr;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String inputStr = in.nextLine();
        String result = solution(inputStr);
        System.out.println(result);
    }
}
