package com.njupt.swg.exception;

public class DuplicateSpitterException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public DuplicateSpitterException() {
		super();
	}

	public DuplicateSpitterException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateSpitterException(String message) {
		super(message);
	}

	public DuplicateSpitterException(Throwable cause) {
		super(cause);
	}

}
