package com.jimprince99.threads;

import java.util.concurrent.TimeUnit;

/**
 * loop gets slower over each iteration
 * @author jpri1335
 *
 */
public class UsingSleeps {

	public static void main(String[] args) throws InterruptedException {
		for (int loop = 0; loop < 10; loop++)
		{
			System.out.println(loop);
			Thread.sleep(loop*100);
		}
		
		TimeUnit.SECONDS.sleep(2);

	}

}
