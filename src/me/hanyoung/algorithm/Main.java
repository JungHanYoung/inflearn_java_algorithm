package me.hanyoung.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        solution(str1, str2);
    }

    private static void solution(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < chars1.length; i++) {
            hashMap1.put(chars1[i], hashMap1.getOrDefault(chars1[i], 0) + 1);
            hashMap2.put(chars2[i], hashMap2.getOrDefault(chars2[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hashMap1.entrySet()) {
            if(!entry.getValue().equals(hashMap2.getOrDefault(entry.getKey(), -1))) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
