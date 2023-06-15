package com.synchrony.test.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.synchrony.test.exception.Error;
import com.synchrony.test.exception.UserNotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ServiceErrorAdvice {

	@ExceptionHandler({ UserNotFoundException.class })
	public ResponseEntity<String> handleNotFoundException(UserNotFoundException e) {
		Error error = new Error(HttpStatus.NOT_FOUND, e.getLocalizedMessage());
		log.info(HttpStatus.NOT_FOUND.toString());
		return new ResponseEntity<String>(error.getMessage(), error.getHttpStatus());
	}

}