package me.hanyoung.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(n, k, arr);
        System.out.println(result);
    }

    private static int solution(int n, int k, int[] arr) {

        TreeSet<Integer> Tset = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x :
                Tset) {
            cnt++;
            if(cnt == k) return x;
        }

        return -1;
    }
}
