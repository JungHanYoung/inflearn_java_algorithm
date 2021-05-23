package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] ch;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        ch = new int[n+1];
        DFS(1);
    }

    private static void DFS(int x) {
        if(x == n+1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if(ch[i] > 0) tmp.append(i).append(" ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
            return;
        }
        ch[x] = 1;
        DFS(x+1);
        ch[x] = 0;
        DFS(x+1);
    }
}
