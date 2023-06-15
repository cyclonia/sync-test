package com.synchrony.test.exception;

public class ServiceUnavailableException extends RuntimeException{
	
	public ServiceUnavailableException(String exception) {
		super(exception);
	}

}
