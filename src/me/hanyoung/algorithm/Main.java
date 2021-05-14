package me.hanyoung.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        String n = in.next();
        char result = solution(num, n);
        System.out.println(result);
    }

    private static char solution(int num, String n) {
        char[] chars = n.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num; i++) {
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i], 0) + 1);
        }
        char answer = ' ';
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry:
        hashMap.entrySet()){
            if(max < entry.getValue()) {
                max = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }
}
