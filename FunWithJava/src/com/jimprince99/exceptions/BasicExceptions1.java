package com.jimprince99.exceptions;

public class BasicExceptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void myException1() {

		try {
			int[] test = { 1, 2, 3 };
			System.out.println(test[10]);
		} catch (Exception e) {
			System.out.println("caught exception");
		} finally {
			System.out.println(" and ran the finally branch");
		}
	}

	public void myException2() throws Exception {

		throw new Exception("jim");

	}
	
	public void myException3() throws Exception {

		throw new RuntimeException("jim");

	}
	

}
