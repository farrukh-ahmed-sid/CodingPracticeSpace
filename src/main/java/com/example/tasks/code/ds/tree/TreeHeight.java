package com.example.tasks.code.ds.tree;

import com.example.tasks.code.ds.tree.base.Node;

import java.util.Objects;

public class TreeHeight {

    private int count = 0;
    private int max = 0;

    //Return count of tree height/levels. Root consider 0 height
    public int height(Node root) {

        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return max;
        }

        count++;

        if (Objects.nonNull(root.left)) {
            height(root.left);
        }
        if (Objects.nonNull(root.right)) {
            height(root.right);
        }
        if (count > max) {
            max = count;
        }
        count--;

        return max;
    }
}
