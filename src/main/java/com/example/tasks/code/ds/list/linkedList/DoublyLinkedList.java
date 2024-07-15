package com.example.tasks.code.ds.list.linkedList;

public class DoublyLinkedList {

    Node head;

    public DoublyLinkedList(Node head) {
        this.head = head;
    }

    public void append(int val) {

        if (head == null) {
            head = new Node(val);
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);
    }

    public void prepend(int val) {

        if (head == null) {
            head = new Node(val);
            return;
        }
        head.pre = new Node(val);
        head.pre.next = head;
        head = head.pre;
    }

    public void deleteWithValue(int val) {

        if (head == null) {
            return;
        }
        if (head.data == val) {
            head = head.next;
            return;
        }
        Node current = head;

        while (current.next != null) {
            if (current.next.data == val) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public void printLinkedList() {

        Node current = head;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

}
