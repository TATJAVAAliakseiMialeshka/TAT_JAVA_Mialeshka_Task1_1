package com.epam.ta.fundamentals.task1.exception;

public class PerformerException extends Exception {

	private static final long serialVersionUID = 1L;

	public PerformerException(String message, Throwable cause) {
		super(message, cause);
	}

	public PerformerException(String message) {
		super(message);
	}

}
