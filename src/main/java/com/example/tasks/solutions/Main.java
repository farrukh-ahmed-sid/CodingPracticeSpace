package com.example.tasks.solutions;


import com.example.tasks.solutions.amazon.hackerrank.trie.ContactAddAndFind;

import static com.example.tasks.solutions.amazon.hackerrank.trie.ContactAddAndFind.initialize;

public class Main {

    public static int age = 0;
    String name = "";
    public static void print(){
        System.out.println("HI STatic");
    }

    public static void main(String[] args) {
        ContactAddAndFind contactAddAndFind = new ContactAddAndFind();
        System.out.println(contactAddAndFind.contacts(initialize()));
    }

}


