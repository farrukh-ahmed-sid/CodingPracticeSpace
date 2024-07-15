package com.example.tasks;


import com.example.tasks.code.ds.tree.TreeHeight;
import com.example.tasks.code.ds.tree.base.Node;

public class Main {

    public static void main(String[] args) {
        TreeHeight treeHeight = new TreeHeight();

        Node root = treeHeight.initialize() ;

        System.out.println(treeHeight.height(root));
    }

}
