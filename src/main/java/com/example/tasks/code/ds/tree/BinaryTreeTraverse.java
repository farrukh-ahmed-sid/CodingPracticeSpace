package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.BinaryTreeBaseProblems;
import com.example.tasks.code.ds.tree.base.Node;

public class BinaryTreeTraverse extends BinaryTreeBaseProblems {

    public void inOrderTravers(Node node) {

        if (node.left != null) {
            inOrderTravers(node.left);
        }

        System.out.println(node.data);

        if (node.right != null) {
            inOrderTravers(node.right);
        }

    }

    public void inOrderReverseTravers(Node node) {

        if (node.right != null) {
            inOrderReverseTravers(node.right);
        }

        System.out.println(node.data);

        if (node.left != null) {
            inOrderReverseTravers(node.left);
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

    public void printLeafNodes(Node node) {
        if (node.left == null && node.right == null) {
            System.out.println(node.data);
        }
        if (node.left != null) {
            printLeafNodes(node.left);
        }
        if (node.right != null) {
            printLeafNodes(node.right);
        }
    }

}
