package com.example.tasks.designPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String dirName;

    public Directory (String name) {
        dirName = name;
    }

    List<FileSystem> fileSystems;

    public void add(FileSystem fs) {
        if (fileSystems == null) {
            fileSystems = new ArrayList<>();
        }
        fileSystems.add(fs);
    }

    @Override
    public void print() {
        System.out.println(dirName);

        if (fileSystems != null) {
            for(FileSystem fileSystem : fileSystems) {
                fileSystem.print();
            }
        }
    }
}
