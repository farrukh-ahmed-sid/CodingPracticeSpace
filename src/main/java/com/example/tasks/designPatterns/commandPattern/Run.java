package com.example.tasks.designPatterns.commandPattern;

import com.example.tasks.designPatterns.commandPattern.command.Command;
import com.example.tasks.designPatterns.commandPattern.command.TVOffCommand;
import com.example.tasks.designPatterns.commandPattern.invoker.TVRemote;
import com.example.tasks.designPatterns.commandPattern.receiver.Device;
import com.example.tasks.designPatterns.commandPattern.receiver.TV;

public class Run {

    public static void main(String[] args) {

        Device tv = new TV();

        Command command = new TVOffCommand(tv);

        TVRemote tvRemote = new TVRemote();
        tvRemote.setCommand(command);

        tvRemote.pressButton();
    }
}
