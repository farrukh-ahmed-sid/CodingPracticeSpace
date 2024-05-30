package com.example.tasks.designPatterns.chainOfResponsibility;

public class FrontLineSupport implements Severity{

    private Severity nextSeverity;

    FrontLineSupport() {
        nextSeverity = new Intermediate();
    }

    @Override
    public void handle(SeverityEnum request) {

        if (request.equals(SeverityEnum.BASIC)) {
            System.out.println("Basic handling");
        } else {
            nextSeverity.handle(request);
        }

    }
}
