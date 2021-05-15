package me.hanyoung.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = solution(n, k, arr);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int n, int k, int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int lt = 0, rt = k - 1;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = lt; i < rt; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = rt; i < n; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            answerList.add(hashMap.size());
            hashMap.put(arr[lt], hashMap.get(arr[lt]) - 1);
            if(hashMap.get(arr[lt]) == 0) {
                hashMap.remove(arr[lt]);
            }
            lt++;
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
