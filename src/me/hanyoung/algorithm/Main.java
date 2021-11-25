package me.hanyoung.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        SsirmSunsu[] arr = new SsirmSunsu[N];
        for (int i = 0; i < N; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();
            arr[i] = new SsirmSunsu(height, weight);
        }
        List<SsirmSunsu> sunsuList = Arrays
                .stream(arr)
                .sorted((sunsu1, sunsu2) -> sunsu2.height - sunsu1.height)
                .collect(Collectors.toList());
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for (SsirmSunsu ssirmSunsu : sunsuList) {
            int weight = ssirmSunsu.weight;
            if (weight > max) {
                cnt++;
                max = weight;
            }
        }
        System.out.println(cnt);
    }

    private static class SsirmSunsu {
        int height;
        int weight;
        SsirmSunsu(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
    }
}
