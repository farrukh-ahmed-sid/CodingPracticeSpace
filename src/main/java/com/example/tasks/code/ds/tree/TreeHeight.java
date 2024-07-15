package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.BinaryTreeBaseProblems;
import com.example.tasks.code.ds.tree.base.Node;

import java.util.Objects;

public class TreeHeight extends BinaryTreeBaseProblems {

    //Return count of tree height/levels. Root consider 0 height
    public int height(Node node) {

        if (node == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            /* use the larger one */
            return Math.max(lDepth, rDepth) + 1;
        }
    }
}
