package com.jimprince99.exceptions;

public class MyRuntimeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	MyRuntimeException(String errorMessage) {
		super(errorMessage);
	}
	

}
