package com.example.profile.vo;

import lombok.Data;

@Data
public class ErrorInfo {
    private final String exceptionClass;
    private String message;
    private Exception exception;

    public ErrorInfo(String message) {
        this.exceptionClass = null;
        this.message = message;
    }

    public ErrorInfo(Exception exception) {
        exceptionClass = exception.getClass().getSimpleName();
        this.exception = exception;
        this.message = exception.getMessage();
    }
}
