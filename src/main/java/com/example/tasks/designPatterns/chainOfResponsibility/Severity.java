package com.example.tasks.designPatterns.chainOfResponsibility;

public interface Severity {

    void handle(SeverityEnum request);
}
