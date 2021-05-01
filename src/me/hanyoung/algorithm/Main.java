package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    private static boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i < num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :
                solution(count, arr)) {
            System.out.print(x + " ");
        }

    }
}
