package com.example.tasks.designPatterns.commandPattern.invoker;

import com.example.tasks.designPatterns.commandPattern.command.Command;

public class TVRemote {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
