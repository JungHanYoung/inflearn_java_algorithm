package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int solution(int input) {
        int sum = 0;
        boolean[] checkList = new boolean[input+1];
        for (int i = 2; i < checkList.length; i++) {
            if(!checkList[i]) {
                sum++;
                for (int j = i; j < checkList.length; j += i) {
                    checkList[j] = true;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int result = solution(in.nextInt());
        System.out.println(result);
    }
}
