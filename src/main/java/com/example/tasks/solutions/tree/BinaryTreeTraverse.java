package com.example.tasks.solutions.tree;

public class BinaryTreeTraverse extends BinaryTreeBase {

    public void inOrderTravers(Node node) {

        if (node.left != null) {
            inOrderTravers(node.left);
        }

        System.out.println(node.data);

        if (node.right != null) {
            inOrderTravers(node.right);
        }

    }

    public void preOrderTravers(Node node) {

        System.out.println(node.data);

        if (node.left != null) {
            preOrderTravers(node.left);
        }

        if (node.right != null) {
            preOrderTravers(node.right);
        }

    }

    public void postOrderTravers(Node node) {

        if (node.left != null) {
            postOrderTravers(node.left);
        }

        if (node.right != null) {
            postOrderTravers(node.right);
        }

        System.out.println(node.data);
    }

}
