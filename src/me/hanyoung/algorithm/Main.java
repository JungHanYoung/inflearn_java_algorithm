package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int n, m;
    private static List<List<Integer>> h = new ArrayList<>();
    private static int[] arr;
    private static boolean[] checks;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n+1];
        checks = new boolean[n+1];
        for(int i = 0; i <= n; i++) {
            h.add(new ArrayList<>());
            arr[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < m; i++) {
            int startPoint = in.nextInt();
            int endPoint = in.nextInt();
            h.get(startPoint).add(endPoint);
        }
        checks[1] = true;
        BFS(1, 0);
        for(int i = 2; i <= n; i++) {
            System.out.printf("%d : %d%n", i, arr[i]);
        }
    }

    private static void BFS(int point, int distance) {
        if(arr[point] > distance) arr[point] = distance;
        for(int p : h.get(point)) {
            if(!checks[p]) {
                checks[p] = true;
                BFS(p, distance+1);
                checks[p] = false;
            }
        }
    }
}
