package com.example.exception;

public class InvalidDoctorStatusException extends RuntimeException {
    public InvalidDoctorStatusException(String message) {
        super(message);
    }
}
