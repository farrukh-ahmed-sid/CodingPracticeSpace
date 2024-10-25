package com.example.tasks.designPatterns;

public class Singleton {

    private static volatile String obj = null;

    private Singleton() {}

    public static String getObject() {

            if (obj == null) {
                synchronized (Singleton.class) {
                    if (obj == null) {
                        obj = "created";
                    }
                }
            }
        return obj;
    }

}
