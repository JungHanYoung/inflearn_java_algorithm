package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int result = solution(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int lt = 1;
        int sum = 0;
        int cnt = 0;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {
            sum += rt;
            if(sum > n) {
                while(sum >= n) {
                    if(sum == n) cnt++;
                    sum -= lt++;
                }
            } else if(sum == n) {
                cnt++;
            }
        }
        return cnt;
    }
}
