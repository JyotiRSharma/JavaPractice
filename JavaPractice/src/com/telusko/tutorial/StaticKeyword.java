package com.telusko.tutorial;

class Emp {
	int eid;
	int salary;
	static String ceo;
	
	static { //Static block gets called only once with the class
		ceo = "Larry";
	}
	
	public Emp() { //Constructor get called each time the object is created.
		eid = 1;
		salary = 2000;
	}
	
	public void display() {
		System.out.println("eid :" + eid + "salary: " + salary + "ceo: " + ceo);
	}
}


public class StaticKeyword {

	int i = 0;
	public static void main(String[] args) {
		
		i++; //We cannot access nonstatic variables in a static method.
		
		Emp jyoti = new Emp(); //Creating an object by calling the contructor
		jyoti.eid = 12345;
		jyoti.salary = 12_000;
		
		
		Emp ranjan = new Emp();
		ranjan.eid = 67891;
		ranjan.salary = 13_000;
		Emp.ceo = "Shyam"; //If the static ceo is changed to Shyam, 
							  //the change is affected all over
							  //Because now the ceo data is store in the Class Loader Memory
							 //Earlier it was stored in heap memory.
		//There is not need to create an object for calling static variable.
		//Same goes for static methods.
		//That's why the main() is static
		System.out.println("Jyoti: ");
		jyoti.display();
		
		System.out.println("Ranjan: ");
		ranjan.display();
		
	}
}
