package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static String solution(int num, String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i += 7) {
            String secretAlphabet = str.substring(i, i+7);
            secretAlphabet = secretAlphabet.replaceAll("[#]", "1");
            secretAlphabet = secretAlphabet.replaceAll("[*]", "0");
            int parseInt = Integer.parseInt(secretAlphabet, 2);
            answer.append((char) parseInt);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.println(solution(input1, input2));
    }
}
