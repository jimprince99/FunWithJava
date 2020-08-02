package com.jimprince99.generalstuff;

public interface TestInterface {
	
	void method1(int x);
	
	default void method2(int x)
	{
		System.out.println(x);
	}
	
	/**
	 * so, you can not create a private method in an interface
	 */
//	private default void method3(int x) 
//	{
//		System.out.println(x);
//	}
	
	

}
