package com.example.tasks;


import com.example.tasks.solutions.tree.Node;
import com.example.tasks.solutions.tree.SmallestKthElement;

public class Main {

    public static void main(String[] args) {

        SmallestKthElement smallestKthElement = new SmallestKthElement();
        Node n = smallestKthElement.kthSmallest2(smallestKthElement.initialize(), 4);

        if (n == null)
            System.out.println(n);
        else
            System.out.println(n.data);

    }

}


