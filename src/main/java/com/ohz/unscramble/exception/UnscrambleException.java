package com.ohz.unscramble.exception;

import org.springframework.http.HttpStatus;

public class UnscrambleException extends Exception {

    private final String message;
    private final HttpStatus httpStatus;

    public UnscrambleException(String message, HttpStatus httpStatus){
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
