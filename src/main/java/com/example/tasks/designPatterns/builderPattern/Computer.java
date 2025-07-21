package com.example.tasks.designPatterns.builderPattern;

public
class Computer {

    private final String cpu;
    private final String ram;
    private final String gpu;
    private final String security;

    public Computer(ComputerBuilder builder){
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.gpu = builder.getGpu();
        this.security = builder.getSecurity();
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getSecurity() {
        return security;
    }
}

