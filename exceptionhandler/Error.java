package com.javaTirana42.sda_spring_framework_java_tr_42.exceptionhandler;

public class Error {

    private String message;

    public Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
