package com.example.tasks.solutions.list;

public class DoublyLinkedList {


    public Node insertNodeInAscending(Node head, int element) {

        Node newNode = new Node(element);

        if (head == null) {
            return newNode;
        }

        if (head.data > element) {
            newNode.next = head;
            head.pre = newNode;
            return newNode;
        }

        Node currentNode = head.next;
        Node endNode = head;

        while (currentNode != null) {

            if (currentNode.data > element) {
                newNode.next = currentNode;
                newNode.pre = endNode;
                currentNode.pre = newNode;
                endNode.next = newNode;
                return head;
            } else {
                endNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        endNode.next = newNode;

        return head;
    }

    public void printLinkedList(Node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
