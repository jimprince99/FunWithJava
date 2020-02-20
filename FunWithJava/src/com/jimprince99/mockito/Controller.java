package com.jimprince99.mockito;

import java.util.HashMap;
import java.util.Map;

/**
 * Just a class to do something with my mock subscriber
 * 
 * @author jpri1335
 *
 */
public class Controller {

	Map<String, Subscriber> subscribers = new HashMap<>();
	
	protected void add(Subscriber subscriber) 
	{
		this.subscribers.put(subscriber.getFirstName(), subscriber);
	}
	
	protected Subscriber get(String subscriber)
	{
		return this.subscribers.get(subscriber);
	}
	
	protected int getAge(String sub)
	{
		Subscriber subscriber = this.get(sub);
		
		return subscriber.getAge();
	}
}
