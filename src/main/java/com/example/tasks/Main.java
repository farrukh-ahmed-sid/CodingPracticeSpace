package com.example.tasks;


import com.example.tasks.solutions.list.DoublyLinkedList;
import com.example.tasks.solutions.list.Node;

public class Main {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        Node node = null;
        node = list.insertNodeInAscending(node, 5);
        node = list.insertNodeInAscending(node, 4);
        node = list.insertNodeInAscending(node, 3);
        node = list.insertNodeInAscending(node, 1);
        node = list.insertNodeInAscending(node, 2);

        list.printLinkedList(node);

    }

}


