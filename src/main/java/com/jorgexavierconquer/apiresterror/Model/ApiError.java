package com.jorgexavierconquer.apiresterror.Model;

import jakarta.persistence.Entity;


import java.time.LocalDateTime;



public class ApiError {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ApiError(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();// Define o timestamp automaticamente
    }




}
