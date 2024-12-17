package com.javaTirana42.sda_spring_framework_java_tr_42.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler {

    @ExceptionHandler(SdaException.class)
    public Error handleSdaException(SdaException e ){
        return new Error(e.getMessage());
    }


    @ExceptionHandler(SpecificSdaException.class)
    public Error handleSpecificSdaException(SpecificSdaException e ){
        return new Error(e.getMessage());
    }
}
