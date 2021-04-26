package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> solution(String s, char c) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int dist = 0;
            while(i -dist > -1 || i +dist < s.length()) {
                if(i -dist >= 0 && s.charAt(i -dist) == c) break;
                else if(i +dist < s.length() && s.charAt(i +dist) == c) break;
                else dist++;
            }
            answer.add(dist);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char ch = in.next().charAt(0);
        for (int i : solution(str, ch)) {
            System.out.print(i + " ");
        }
    }
}
