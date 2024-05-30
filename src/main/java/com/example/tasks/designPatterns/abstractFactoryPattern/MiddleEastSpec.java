package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Spec;

public class MiddleEastSpec implements Spec {
    @Override
    public void carSpec() {
        System.out.println("ME Spec");
    }
}
