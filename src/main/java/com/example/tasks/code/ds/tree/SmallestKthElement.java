package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.BinaryTreeBaseProblems;
import com.example.tasks.code.ds.tree.base.Node;


public class SmallestKthElement extends BinaryTreeBaseProblems {

    int count;

    // With inorder traversal
    public Node kthSmallest(Node root, int k) {
        // base case
        if (root == null)
            return null;

        // search in left subtree
        Node left = kthSmallest(root.left, k);

        // need to return it if value found else count++ will trigger.
        if (left != null)
            return left;

        // if current element is k'th smallest, return it
        count++;
        if (count == k)
            return root;

        // else search in right subtree
        return kthSmallest(root.right, k);
    }

}
