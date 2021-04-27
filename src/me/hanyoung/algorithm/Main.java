package me.hanyoung.algorithm;

import java.util.Scanner;

public class Main {

    public static char[] solution(int[] listA, int[] listB) {
        char[] answer = new char[listA.length];
        // 1.가위 2.바위 3.보
        for (int i = 0; i < listA.length; i++) {
            // 비길때
            if(listA[i] == listB[i]) {
                answer[i] = 'D';
                continue;
            }

            if(listA[i] == 1) {
                answer[i] = listB[i] == 3 ? 'A' : 'B';
            } else if(listA[i] == 2) {
                answer[i] = listB[i] == 1 ? 'A' : 'B';
            } else {
                answer[i] = listB[i] == 2 ? 'A' : 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] listA = new int[input1];
        int[] listB = new int[input1];
        for (int i = 0; i < input1; i++) {
            listA[i] = in.nextInt();
        }
        for (int i = 0; i < input1; i++) {
            listB[i] = in.nextInt();
        }
        char[] result = solution(listA, listB);
        for (char c : result) {
            System.out.println(c);
        }
    }
}
