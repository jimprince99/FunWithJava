package com.jimprince99.exceptions;

public class MyCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyCheckedException(String errorMessage) {
		super(errorMessage);
	}

}
