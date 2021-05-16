package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        int result = solution(N, M, arr);
        System.out.println(result);
    }

    private static int solution(int n, int m, int[] arr) {
        Queue<Person> queue = new LinkedList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while(!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person el : queue) {
                if (el.danger > temp.danger) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                cnt++;
                if(temp.idx == m) return cnt;
            }
        }
        return cnt;
    }

}

class Person {
    int idx;
    int danger;

    Person(int idx, int danger) {
        this.idx = idx;
        this.danger = danger;
    }
}
