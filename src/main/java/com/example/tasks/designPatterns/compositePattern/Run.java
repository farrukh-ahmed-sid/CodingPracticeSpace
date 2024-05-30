package com.example.tasks.designPatterns.compositePattern;

public class Run {

    public static void runIt() {

        Directory root = new Directory("root");
        Directory home = new Directory("home");
        MyFile file1 = new MyFile("readme.txt");
        Directory documents = new Directory("documents");
        MyFile file2 = new MyFile("report.pdf");

        root.add(home);
        home.add(file1);
        home.add(documents);
        documents.add(file2);

        root.print();
    }
}
