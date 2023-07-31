package com.org.exception;

import com.org.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> getException(ResourceNotFoundException exp)
    {
        return new ResponseEntity<ApiResponse>(
                ApiResponse.builder()
                .message(exp.getMessage())
                .httpStatus(HttpStatus.NOT_FOUND)
                .isSuccessfull(false).build(),
                HttpStatus.NOT_FOUND);
    }

}
