package com.synchrony.test.exception;

public class BadRequestException extends RuntimeException {

	public BadRequestException(String exception) {
		super(exception);
	}
}
