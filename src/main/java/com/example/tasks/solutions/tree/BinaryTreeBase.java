package com.example.tasks.solutions.tree;

import java.util.Objects;

public class BinaryTreeBase {

    private int count = 0;
    private int max = 0;
    private Node foundNode = null;

    public Node initialize() {

        Node n = null;
        int[] arr = {3, 5, 2, 1, 4, 6, 7};

        for (int i : arr) {
            n = insertNode(n, i);
        }
        return n;
    }

    public Node insertNode(Node node, Integer val) {
        if (node == null) {
            node = new Node();
            node.data = val;
        } else if (val < node.data) {
            node.left = insertNode(node.left, val);
        } else if (val > node.data) {
            node.right = insertNode(node.right, val);
        }
        return node;
    }

    //Return count of tree height/levels. Root consider 0 height
    public int height(Node root) {

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

    public Node getNode(Node root, Integer val) {

        findNode(root, val);
        return foundNode;
    }

    private void findNode(Node node, Integer val) {
        if (foundNode == null) {
            if (val.equals(node.data)) {
                foundNode = node;
            } else if (node.data > val) {
                findNode(node.left, val);
            } else {
                findNode(node.right, val);
            }
        }
    }
}
