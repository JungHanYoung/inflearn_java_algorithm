package me.hanyoung.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();

        solution(str);
    }

    private static void solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c :
                chars) {
            if(c == '(') {
                stack.push(c);
            }

            if(c == ')') {
                if(stack.empty()) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
