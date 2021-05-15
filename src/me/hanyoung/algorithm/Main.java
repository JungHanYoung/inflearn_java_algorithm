package me.hanyoung.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int len = in.nextInt();
        int[] positions = new int[len];
        for (int i = 0; i < len; i++) {
            positions[i] = in.nextInt();
        }
        int result = solution(n, arr, len, positions);
        System.out.println(result);
    }

    private static int solution(int n, int[][] arr, int len, int[] positions) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int position : positions) {
            for (int j = 0; j < n; j++) {
                int block = arr[j][position-1];
                arr[j][position-1] = 0;
                if(block == 0) continue;
                if(stack.isEmpty()) {
                    stack.push(block);
                    break;
                }
                if(stack.peek() == block) {
                    stack.pop();
                    answer += 2;
                    break;
                } else {
                    stack.push(block);
                    break;
                }
            }
        }
        return answer;
    }
}
