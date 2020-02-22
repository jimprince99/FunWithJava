package com.jimprince99.exceptions;

public class BasicExceptions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void generateMyCheckedException() throws MyCheckedException {
		throw new MyCheckedException("jim");
		
	}
	
	public void generateMyRuntimeException() {
		throw new MyRuntimeException("jim2");
	}

}
