package com.telesens.academy.lesson08class.exc;

public class ParseAbonentException extends Exception {
    String message;

    public ParseAbonentException(String empty_file) {
        this.message = empty_file;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
