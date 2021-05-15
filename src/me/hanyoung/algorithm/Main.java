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
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int front = stack.pop();
                int rear = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(rear + front);
                        break;
                    case '-':
                        stack.push(rear - front);
                        break;
                    case '*':
                        stack.push(rear * front);
                        break;
                    case '/':
                        stack.push(rear / front);
                        break;
                    default:
                        break;
                }
            }
        }

        return stack.pop();
    }
}
