package com.example.tasks.designPatterns.compositePattern;

public class MyFile implements FileSystem{

    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
