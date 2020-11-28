package com.telusko.tutorial;


//class Hi1 implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Hi");
//			try {Thread.sleep(1000);} catch (InterruptedException e) {}
//		}
//	}
//	
//}

//class Hello2 implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i = 0; i < 5; i++) {
//		System.out.println("Hello");
//		try {Thread.sleep(1000);} catch (InterruptedException e) {}
//		}
//	}
//	
//}

public class RunnableMultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Hi1 h1 = new Hi1();
//		Hello2 h2 = new Hello2();
//		
//		Thread t1 = new Thread(h1);
//		Thread t2 = new Thread(h2);
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			// TODO Auto-generated method stub
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});
		
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
	}

}
