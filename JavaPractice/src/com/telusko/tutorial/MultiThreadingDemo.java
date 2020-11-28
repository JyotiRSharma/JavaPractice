package com.telusko.tutorial;

class Hi extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
	
}

class Hello extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
		System.out.println("Hello");
		try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
	
}

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hi h1 = new Hi();
		Hello h2 = new Hello();
		
		
		h1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		h2.start();
	}

}
