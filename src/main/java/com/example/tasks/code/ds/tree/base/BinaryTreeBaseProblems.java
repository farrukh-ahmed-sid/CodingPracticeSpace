package com.example.tasks.code.ds.tree.base;

public class BinaryTreeBaseProblems {

    public Node initialize() {

        Node n = null;
        int[] arr = {0,4,2,7,5,3,11};

        for (int i : arr) {
            n = insertNode(n, i);
        }
        return n;
    }

    public Node insertNode(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }
        else if (root.data > val) {
            root.left = insertNode(root.left, val);
        }
        else if (root.data < val) {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public Node getNodeWithValue(Node root, int val) {

        if (root != null) {
            if (root.data == val) {
                return root;
            }
            else if (root.data > val) {
                root = getNodeWithValue(root.left, val);
            }
            else {
                root = getNodeWithValue(root.right, val);
            }
        }
        return root;
    }

    public Node removeNode(Node root, int val) {

        if (root.data > val) {
            root.left = removeNode(root.left, val);
        } else if (root.data < val) {
            root.right = removeNode(root.right, val);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                root.data = inOrderPredecessor(root.left).data;
                root.left = removeNode(root.left, root.data);
            }
        }
        return root;
    }

    private Node inOrderPredecessor(Node root) {

        if (root.right == null) {
            return root;
        } else {
            return inOrderPredecessor(root.right);
        }
    }

    private Node inOrderSuccessor(Node root) {

        if (root.left == null) {
            return root;
        } else {
            return inOrderPredecessor(root.left);
        }
    }
}
