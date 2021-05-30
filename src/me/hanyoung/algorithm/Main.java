package me.hanyoung.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node lt;
    Node rt;
    public Node(int data) {
        this.data = data;
    }
}

public class Main {

    Node root;

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(BFS(tree.root));
    }

    private static int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        int level = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i <size; i++) {
                Node cur = q.poll();
                if(cur.lt==null && cur.rt==null) {
                    return level;
                }
                if(cur.lt!=null) q.offer(cur.lt);
                if(cur.rt!=null) q.offer(cur.rt);
            }
            level++;
        }
        return level;
    }
}
