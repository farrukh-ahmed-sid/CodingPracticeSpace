package com.example.tasks;


import com.example.tasks.solutions.tree.BinaryTreeTraverse;
import com.example.tasks.solutions.tree.base.Node;

public class Main {

    public static void main(String[] args) {

        BinaryTreeTraverse binaryTree = new BinaryTreeTraverse();
        Node node = binaryTree.initialize();
        binaryTree.printLeafNodes(node);


    }

}



