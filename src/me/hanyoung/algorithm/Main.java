package me.hanyoung.algorithm;

import java.util.Scanner;

class Node {
    int data;
    Node lt;
    Node rt;
    Node(int data){
        this.data = data;
    }
}

public class Main {
    Node root;

    public void DFS(Node root) {
        if(root == null) return;
        System.out.println(root.data);
        DFS(root.lt);
        DFS(root.rt);
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.rt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
