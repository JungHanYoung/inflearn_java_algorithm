package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    stack.pop();
                    break;
                default:
                    if(stack.size() == 0) {
                        sb.append(c);
                    }
            }
        }

        return sb.toString();
    }
}
