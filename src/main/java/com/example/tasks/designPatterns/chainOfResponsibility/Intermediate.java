package com.example.tasks.designPatterns.chainOfResponsibility;

public class Intermediate implements Severity{


    private Severity nextSeverity;

    Intermediate() {
        nextSeverity = new Critical();
    }

    @Override
    public void handle(SeverityEnum request) {

        if (request.equals(SeverityEnum.INTERMEDIATE)) {
            System.out.println("Intermediate handling");
        } else {
            nextSeverity.handle(request);
        }
    }
}
