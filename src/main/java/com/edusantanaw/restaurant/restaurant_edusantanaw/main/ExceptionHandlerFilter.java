package com.edusantanaw.restaurant.restaurant_edusantanaw.main;


import com.edusantanaw.restaurant.restaurant_edusantanaw.application.exceptions.NotFoundException;
import com.edusantanaw.restaurant.restaurant_edusantanaw.domain.exceptions.EntityValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerFilter extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityValidationException.class)
    private ResponseEntity<String> entityValidationException(EntityValidationException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<String> notFoundException(NotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
 }
