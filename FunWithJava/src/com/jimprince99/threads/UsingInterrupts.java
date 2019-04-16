package com.jimprince99.threads;

public class UsingInterrupts extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread me = new UsingInterrupts();
		me.start();
		Thread.sleep(1000);
		me.interrupt();
		me.join();
		System.out.println("Stopped");
	}
	
	@Override
	public void run()
	{
		int count=1;
		for (;;)
		{
			System.out.println(("Hello World again " + count++));

			if (Thread.interrupted())
			{
				return;
			}
		}
	}

}
