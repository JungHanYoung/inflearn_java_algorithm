package me.hanyoung.algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int[] arr;
    static int N, M;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        BFS(new Stack<>());
    }

    private static void BFS(Stack<Integer> list) {
        if(list.size() == M) {
            for(int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for(int i = 1; i <= N; i++) {
                list.push(i);
                BFS(list);
                list.pop();
            }
        }
    }
}
