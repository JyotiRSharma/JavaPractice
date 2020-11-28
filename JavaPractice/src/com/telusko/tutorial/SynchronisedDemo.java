package com.telusko.tutorial;

class Counter {
	int counter;
	
	public synchronized void increment() { //Making it thread safe
		counter++;
	}
}

public class SynchronisedDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c = new Counter();
		
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int  i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int  i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(c.counter);
	}

}
