package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(n, c, arr);
        System.out.println(result);
    }

    private static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int val = arr[i+1] - arr[i];
            if(val < lt) lt = val;
        }
        int rt = arr[n-1];
        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count(arr, mid) < c) {
                rt = mid-1;
            } else {
                lt = mid+1;
                answer = mid;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int mid) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= mid) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
