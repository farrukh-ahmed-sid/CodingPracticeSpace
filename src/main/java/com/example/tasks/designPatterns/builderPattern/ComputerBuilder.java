package com.example.tasks.designPatterns.builderPattern;

public class ComputerBuilder {
    private final String cpu;
    private final String ram;
    private String gpu;
    private String security;

    public ComputerBuilder(String cpu, String ram){
        this.cpu = cpu;
        this.ram = ram;
    }

    public Computer builder(){
        return new Computer(this);
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

}
