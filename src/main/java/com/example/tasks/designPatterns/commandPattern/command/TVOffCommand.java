package com.example.tasks.designPatterns.commandPattern.command;

import com.example.tasks.designPatterns.commandPattern.receiver.Device;

public class TVOffCommand implements Command{

    private final Device tv;

    public TVOffCommand(Device tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
