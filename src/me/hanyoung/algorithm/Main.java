package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count = in.nextInt();
        arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        int left = Arrays.stream(arr)
                .sum();
        int right = 0;
        if(DFS(0, left, right)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean DFS(int l, int left, int right) {
        if(left == right) return true;
        else if(l == arr.length) return false;
        else return DFS(l+1, left-arr[l], right+arr[l]) || DFS(l+1, left, right);
    }
}
