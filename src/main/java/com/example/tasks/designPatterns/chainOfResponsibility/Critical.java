package com.example.tasks.designPatterns.chainOfResponsibility;

import java.io.InvalidObjectException;

public class Critical implements Severity{

    @Override
    public void handle(SeverityEnum request) {

        if (request.equals(SeverityEnum.CRITICAL)) {
            System.out.println("Critical handling");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }
}
