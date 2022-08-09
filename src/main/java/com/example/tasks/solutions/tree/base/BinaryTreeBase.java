package com.example.tasks.solutions.tree.base;

public class BinaryTreeBase {

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

    public Node getNode(Node head, Integer val) {

        if (head != null) {
            if (head.data > val) {
                head = getNode(head.left, val);
            } else if (head.data < val) {
                head = getNode(head.right, val);
            }
        }
        return head;
    }

    public void removeNode(Node node, Integer val) {

        if (node.data.equals(val)) {
            node = null;
        }

    }

}
