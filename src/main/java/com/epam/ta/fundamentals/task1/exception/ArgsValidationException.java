package com.epam.ta.fundamentals.task1.exception;

public class ArgsValidationException extends Exception{

	private static final long serialVersionUID = 1L;

	public ArgsValidationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ArgsValidationException(String message) {
		super(message);
	}
}
