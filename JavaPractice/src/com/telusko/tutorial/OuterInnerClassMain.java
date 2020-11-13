package com.telusko.tutorial;


class Outer
{
	public void display() 
	{
		System.out.println("Inside outer class");
	}
	
	class Inner
	{
		public void display() 
		{
			System.out.println("Inside inner class");
		}
	}
}



public class OuterInnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.display(); //Accessing outer class display()
		
		Outer.Inner objIn = obj.new Inner();
		//Inorder to call the Inner class, Outer class is required
		//Inorder to call an non static Inner constructor, Outer class object 
		//is required
		
		objIn.display();
		
		

	}

}
