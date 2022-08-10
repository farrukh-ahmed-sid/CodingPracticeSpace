package com.example.tasks.solutions.tree;

import com.example.tasks.solutions.tree.base.BinaryTreeBase;
import com.example.tasks.solutions.tree.base.Node;

public class SmallestKthElement extends BinaryTreeBase {

    int count;

    // from geeksforgeeks
    public Node kthSmallest(Node root, int k) {
        // base case
        if (root == null)
            return null;

        // search in left subtree
        Node left = kthSmallest(root.left, k);

        // if k'th smallest is found in left subtree, return it
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
