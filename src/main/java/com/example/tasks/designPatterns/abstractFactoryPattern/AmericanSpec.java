package com.example.tasks.designPatterns.abstractFactoryPattern;

import com.example.tasks.designPatterns.abstractFactoryPattern.interfaces.Spec;

public class AmericanSpec implements Spec {
    @Override
    public void carSpec() {
        System.out.println("American Spec");
    }
}
