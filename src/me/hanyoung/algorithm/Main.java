package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = solution(len, arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private static int[] solution(int len, int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int temp = arr[i];
            int res = 0;
            while(temp > 0) {
                res = res*10 + temp % 10;
                temp /= 10;
            }
            if(isPrime(res)) {
                answerList.add(res);
            }

        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private static boolean isPrime(int res) {
        if(res < 2) {
            return false;
        }
        for (int i = 2; i < res; i++) {
            if(res % i == 0) return false;
        }
        return true;
    }
}
