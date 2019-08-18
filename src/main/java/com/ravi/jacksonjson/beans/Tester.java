package com.ravi.jacksonjson.beans;

public class Tester extends User {

    private String testingTask;

    public Tester() {
    }

    public String getTestingTask() {
        return testingTask;
    }

    public void setTestingTask(String testingTask) {
        this.testingTask = testingTask;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "testingTask='" + testingTask + '\'' +
                '}';
    }
}
