package com.synchrony.test.exception;

public class UserAlreadyExistsException extends RuntimeException{
	public UserAlreadyExistsException(String exception) {
		super(exception);
	}

}
