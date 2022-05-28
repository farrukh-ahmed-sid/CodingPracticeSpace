package com.example.tasks.solutions;


import com.example.tasks.solutions.tree.BinaryTreeTraverse;
import com.example.tasks.solutions.tree.Node;

public class Main {

    public static void main(String[] args) {
        BinaryTreeTraverse treeTraverse = new BinaryTreeTraverse();

        Node node = treeTraverse.initialize();

        treeTraverse.postOrderTravers(node);

    }

}


