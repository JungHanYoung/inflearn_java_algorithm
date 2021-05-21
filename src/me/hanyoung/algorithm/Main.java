package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            pairs[i] = new Pair(x, y);
        }
        Pair[] result = solution(n, pairs);
        for (Pair pair : result) {
            System.out.println(pair.x + " " + pair.y);
        }
    }

    private static Pair[] solution(int n, Pair[] pairs) {
        Pair[] clone = pairs.clone();
        Arrays.sort(clone, (p1, p2) -> {
            if(p1.x == p2.x) {
                return p1.y - p2.y;
            }
            return p1.x - p2.x;
        });
        return clone;
    }
}

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }


}