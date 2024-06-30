package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.BinaryTreeBase;
import com.example.tasks.code.ds.tree.base.Node;

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
