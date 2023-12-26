package com.ecore.example.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception) {
        log.error(exception.getMessage(), exception);
        String message = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
        return new ResponseEntity<>(
                message,
                new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
