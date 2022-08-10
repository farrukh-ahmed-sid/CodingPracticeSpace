package com.example.tasks.solutions.tree;

import com.example.tasks.solutions.tree.base.BinaryTreeBase;
import com.example.tasks.solutions.tree.base.Node;

public class LargestKthElement extends BinaryTreeBase {

    int count;

    public Node kthLargestElement(Node node, int k) {

        if (node == null) {
            return null;
        }

        Node n = kthLargestElement(node.right, k);

        if (n != null) {
            return n;
        }

        count++;

        if (count == k) {
            return node;
        }

        return kthLargestElement(node.left, k);
    }

}
