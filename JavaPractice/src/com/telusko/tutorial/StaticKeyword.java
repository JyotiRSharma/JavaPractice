package com.telusko.tutorial;

class Emp {
	int eid;
	int salary;
	String ceo;
	
	public void display() {
		System.out.println("eid :" + eid + "salary: " + salary + "ceo: " + ceo);
	}
}


public class StaticKeyword {

	public static void main(String[] args) {
		Emp jyoti = new Emp(); //Creating an object by calling the contructor
		jyoti.eid = 12345;
		jyoti.salary = 12_000;
		jyoti.ceo = "Ram";
		
		Emp ranjan = new Emp();
		ranjan.eid = 67891;
		ranjan.salary = 13_000;
		ranjan.ceo = "Ram";
		
		System.out.println("Jyoti: ");
		jyoti.display();
		
		System.out.println("Ranjan: ");
		ranjan.display();
		
	}
}