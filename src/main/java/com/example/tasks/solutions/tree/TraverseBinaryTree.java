package com.example.tasks.solutions.tree;

import com.example.tasks.solutions.tree.base.BaseBinaryTree;
import com.example.tasks.solutions.tree.base.Node;

public class TraverseBinaryTree extends BaseBinaryTree {

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

}
