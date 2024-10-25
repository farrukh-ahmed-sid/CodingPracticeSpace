package com.example.tasks.designPatterns.commandPattern.command;

import com.example.tasks.designPatterns.commandPattern.receiver.Device;

public class TVOnCommand implements Command{

    private final Device tv;

    public TVOnCommand(Device tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
