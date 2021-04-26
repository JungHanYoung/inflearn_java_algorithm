package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String[] solution(String[] strList) {
        StringBuilder sb;
        String[] reversedStrList = new String[strList.length];

        for(int i = 0; i < strList.length; i++) {
            sb = new StringBuilder();
            String targetStr = strList[i];
            for (int j = targetStr.length() - 1; j >= 0; j--) {
                sb.append(targetStr.charAt(j));
            }
            reversedStrList[i] = sb.toString();
        }

        return reversedStrList;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int inputCount = in.nextInt();
        String[] inputStrList = new String[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputStrList[i] = in.next();
        }
//        System.out.println("inputStr : " + inputStr);
//        System.out.println("inputChar : " + inputChar);
        String[] result = solution(inputStrList);
        for (String s :
                result) {
            System.out.println(s);
        }
    }
}
