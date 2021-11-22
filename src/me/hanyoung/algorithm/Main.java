package me.hanyoung.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int M;
    static int[] arr;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        M = in.nextInt();
        arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        BFS(0);
    }

    private static void BFS(int level) {
        if(level == M) {
            for (int i: stack) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int j : arr) {
                if (stack.contains(j)) continue;
                stack.push(j);
                BFS(level + 1);
                stack.pop();
            }
        }
    }
}
