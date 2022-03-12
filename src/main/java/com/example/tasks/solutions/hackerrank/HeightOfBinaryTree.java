package com.example.tasks.solutions.hackerrank;

import java.util.Objects;

public class HeightOfBinaryTree {

    static int count = 0;
    static int max = 0;

    public static Node initialize() {

        Node n = null;
        int[] arr = {3, 5, 2, 1, 4, 6, 7};

        for (int i : arr) {
            n = insert(n, i);
        }
        return n;
    }

    public static Node insert(Node node, Integer val) {
        if (node == null) {
            node = new Node();
            node.data = val;
        } else if (node.data > val) {
            node.left = insert(node.left, val);
        } else if (node.data < val) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    public static int height(Node root) {

        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return max;
        }

        count++;

        if (Objects.nonNull(root.left)) {
            height(root.left);
        }
        if (Objects.nonNull(root.right)) {
            height(root.right);
        }
        if (count > max) {
            max = count;
        }
        count--;

        return max;
    }

    private static class Node {
        int data;
        Node left;
        Node right;
    }

}
