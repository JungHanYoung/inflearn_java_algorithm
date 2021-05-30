package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        int result = solution(s, e);
        System.out.println(result);
    }

    private static int solution(int s, int e) {
        int[] ch = new int[10001];
        int[] dis = {1, -1, 5};
        ch[s] = 1;
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = cur + dis[j];
                    if(e == nx) return answer+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            answer++;
        }

        return 0;
    }
}
