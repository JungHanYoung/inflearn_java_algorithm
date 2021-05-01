package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int getMax(int[] arrInt) {
        int maxValue = Integer.MIN_VALUE;
        for (int j : arrInt) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
        return maxValue;
    }

    public static List<Integer> solution(int[] arrInt) {
        List<Integer> ret = new ArrayList<>();
        int maxInArr = getMax(arrInt);
        boolean[] primeArr = new boolean[maxInArr+1];
        for (int i = 2; i <= maxInArr; i++) {
            primeArr[i] = true;
        }
        for (int i = 2; i <= maxInArr; i++) {
            if(primeArr[i]) {
                for (int j = i * i; j <= maxInArr; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        for (int value :
                arrInt) {
            if (value < 2) continue;
            if(primeArr[value]) ret.add(value);
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] intList = new int[count];
        for (int i = 0; i < count; i++) {
            intList[i] = Integer.parseInt(new StringBuilder(sc.next()).reverse()
                    .toString());
        }
        List<Integer> result = solution(intList);
        for (int value :
                result) {
            System.out.print(value + " ");
        }

    }
}
