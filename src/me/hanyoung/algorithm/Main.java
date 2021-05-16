package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String arrange = in.next();
        String study = in.next();
        String result = solution(arrange, study);
        System.out.println(result);
    }

    private static String solution(String arrange, String study) {
        Queue<Character> queue = new LinkedList<>();
        for (char c :
                arrange.toCharArray()) {
            queue.offer(c);
        }
        for (char c :
                study.toCharArray()) {
            if(queue.contains(c)) {
                if(queue.peek() != c) {
                    return "NO";
                } else {
                    queue.poll();
                }
            }
        }
        if(queue.isEmpty()) return "YES";
        else return "NO";
    }
}
