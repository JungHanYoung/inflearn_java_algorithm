package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static int solution(int[] list) {
        int target = 0;
        int sum = 0;
        for (int i : list) {
            if(target < i) {
                sum++;
                target = i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] list = new int[in.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }
        System.out.println(solution(list));
    }
}
