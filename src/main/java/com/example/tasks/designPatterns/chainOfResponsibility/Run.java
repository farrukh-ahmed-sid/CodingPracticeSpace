package com.example.tasks.designPatterns.chainOfResponsibility;

public class Run {

    public static void runIt(){

        Severity severity = new FrontLineSupport();
        severity.handle(SeverityEnum.CRITICAL);
    }
}
