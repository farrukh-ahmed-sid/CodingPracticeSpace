package com.example.tasks;


import com.example.tasks.solutions.tree.LargestKthElement;
import com.example.tasks.solutions.tree.Node;

public class Main {

    public static void main(String[] args) {

        /*SmallestKthElement smallestKthElement = new SmallestKthElement();
        Node n = smallestKthElement.kthSmallest2(smallestKthElement.initialize(), 4);

        if (n == null)
            System.out.println(n);
        else
            System.out.println(n.data);*/

        LargestKthElement kthElement = new LargestKthElement();
        Node n = kthElement.kthLargestElement(kthElement.initialize(), 5);

        if (n == null)
            System.out.println(n);
        else
            System.out.println(n.data);

    }

}


