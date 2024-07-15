package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.BinaryTreeBaseProblems;
import com.example.tasks.code.ds.tree.base.Node;

public class LargestKthElement extends BinaryTreeBaseProblems {

    int count;

    // With reverse inorder traversal
    public Node kthLargestElement(Node node, int k) {

        if (node == null) {
            return null;
        }

        Node right = kthLargestElement(node.right, k);

        if (right != null) {
            return right;
        }

        count++;

        if (count == k) {
            return node;
        }

        return kthLargestElement(node.left, k);
    }

}
