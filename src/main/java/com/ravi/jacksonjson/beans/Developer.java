package com.ravi.jacksonjson.beans;

public class Developer extends User {
    private String developerTask;

    public Developer() {

    }

    public String getDeveloperTask() {
        return developerTask;
    }

    public void setDeveloperTask(String developerTask) {
        this.developerTask = developerTask;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerTask='" + developerTask + '\'' +
                '}';
    }
}
