package com.example.tasks;


import com.example.tasks.solutions.tree.Node;
import com.example.tasks.solutions.tree.SmallestKthElement;

public class Main {

    public static void main(String[] args) {

        SmallestKthElement smallestKthElement = new SmallestKthElement();
        Node n = smallestKthElement.kthSmallest(smallestKthElement.initialize(), 3);
        System.out.println(n.getData());

    }

}


