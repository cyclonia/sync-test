package com.synchrony.test.advice;

import javax.naming.ServiceUnavailableException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.synchrony.test.exception.BadRequestException;
import com.synchrony.test.exception.UserAlreadyExistsException;
import com.synchrony.test.exception.UserNotFoundException;

@ControllerAdvice
public class ApplicationExceptionHandler {
  
  @ResponseStatus(
      value = HttpStatus.NOT_FOUND,
      reason = "User Not Found")
  @ExceptionHandler(UserNotFoundException.class)
  public void handleException(UserNotFoundException e) {
  }

  @ResponseStatus(
      value = HttpStatus.BAD_REQUEST,
      reason = "Received Invalid Input Parameters")
  @ExceptionHandler(BadRequestException.class)
  public void handleException(BadRequestException e) {
  }
  
  @ResponseStatus(
	      value = HttpStatus.BAD_REQUEST,
	      reason = "User already exists")
	  @ExceptionHandler(UserAlreadyExistsException.class)
	  public void handleException(UserAlreadyExistsException e) {
	  }

  @ResponseStatus(
      value = HttpStatus.GATEWAY_TIMEOUT,
      reason = "imagur Service Not Responding, Try Again")
  @ExceptionHandler(ServiceUnavailableException.class)
  public void handleException(ServiceUnavailableException e) {
  }
}