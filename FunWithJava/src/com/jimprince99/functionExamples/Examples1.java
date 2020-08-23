package com.jimprince99.functionExamples;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Examples1 {

	public static void main(String[] args) {
		
		Examples1 e1 = new Examples1();
		
		if ( e1.isSet.test("hello")) System.out.println("perdicate: 		is populated1");
		if ( e1.isSet.test("")) System.out.println("is populated2");
		if ( e1.isSet.test(null)) System.out.println("is populated3");
		
		System.out.println("function: 		" + e1.returnString.apply(1234));
		
		System.out.println("binaryOperator: 	" + e1.add.apply(1,  2));
		
		System.out.println("unaryOperator: 		" + e1.negate.apply(20));
		
		System.out.println("biFunction: 		" + e1.join.apply("hello ", 1234));
		
		System.out.println("supplier example 	" + e1.mySupplier.get());
		
		e1.myConsumer.accept("		hello");
		
	}
	
	Predicate<String> isSet = element -> ((element != null) && (element != ""));
	
	Function<Integer, String> returnString = element ->  "result=" + element;
	
	BinaryOperator<Integer> add = (element1, element2) -> {return element1 + element2;};

	UnaryOperator<Integer> negate = element -> -1 * element;
	
	BiFunction<String, Integer, String> join = (element1, element2) -> { return "" + element1 + element2;}; 
	
	Supplier<String> mySupplier = () -> "hello";
	
	Consumer<String> myConsumer = element -> System.out.println("myConsumer " + element);
	
}
