package com.example.tasks.designPatterns.builderPattern;

public class Run {

    public static void runIt() {

        Computer computerBasic = new ComputerBuilder("1", "1").builder();

        ComputerBuilder gamingBuilder = new ComputerBuilder("1", "1");
        gamingBuilder.setGpu("8");
        Computer computerGaming = gamingBuilder.builder();
    }
}
