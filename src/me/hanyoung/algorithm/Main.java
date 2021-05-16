package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int result = solution(N, K);
        System.out.println(result);
    }

    private static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 1;
        while (queue.size() > 1) {
            if(cnt == k) {
                queue.poll();
                cnt = 1;
            } else {
                queue.offer(queue.poll());
                cnt++;
            }
        }

        return queue.poll();
    }
}
