package me.hanyoung.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        int result = solution(str);
        System.out.println(result);
    }

    private static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()) {
            if(c == '(') {
                if(stack.isEmpty()) stack.push(c);
                else if(stack.peek() == '(') stack.push(c);
                else if(stack.peek() == ')') {
                    stack.pop();
                    stack.push(c);
                }
            } else if(c == ')') {
                if(stack.peek() == '(') {
                    stack.pop();
                    answer += stack.size();
                    stack.push(')');
                } else if(stack.peek() == ')') {
                    stack.pop();
                    stack.pop();
                    stack.push(')');
                    answer++;
                }
            }
        }

        return answer;
    }
}
