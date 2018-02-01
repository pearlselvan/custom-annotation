package com.pearl.annodation;

public class AppiumRunner {

    String mobileName ;

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public void run() {
        System.out.println("Run with :  " +getMobileName());
    }
}
