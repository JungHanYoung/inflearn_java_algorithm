package me.hanyoung.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    static List<List<Integer>> combiList = new ArrayList<>();
    static List<int[]> houseList = new ArrayList<>();
    static List<int[]> pizzaList = new ArrayList<>();
    static int N, M;

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
                if(map[i][j] == 1) {
                    houseList.add(new int[]{i, j});
                } else if(map[i][j] == 2) {
                    pizzaList.add(new int[]{i, j});
                }
            }
        }
        System.out.println(solution());
    }

    private static int solution() {
        DFS(new Stack<>(), 0);
        int min = Integer.MAX_VALUE;
        for (List<Integer> combi : combiList) {
            int sum = 0;
            for (int[] pos : houseList) {
                sum += minFromPizzaToHouse(combi.stream()
                        .map(idx -> new int[]{pizzaList.get(idx)[0], pizzaList.get(idx)[1]})
                        .collect(Collectors.toList()), pos);
            }
            min = Math.min(min, sum);
        }
        return min;
    }

    private static int minFromPizzaToHouse(List<int[]> pizzaList, int[] housePos) {
        int houseX = housePos[0];
        int houseY = housePos[1];
        int min = Integer.MAX_VALUE;
        for(int[] pos : pizzaList) {
            int dis = Math.abs(pos[0] - houseX) + Math.abs(pos[1] - houseY);
            min = Math.min(min, dis);
        }
        return min;
    }

    private static void DFS(Stack<Integer> list, int start) {
        if(list.size() == M) {
            List<Integer> temp = new ArrayList<>(list);
            combiList.add(temp);
        } else {
            int size = pizzaList.size();
            for (int i = start; i < size; i++) {
                if(!list.contains(i)) {
                    list.push(i);
                    DFS(list, i+1);
                    list.pop();
                }
            }
        }
    }
}
