package com.telusko.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int roll;
	int marks;
	String name;
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.length() > o.name.length() ? 1 : -1;
	}

	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
}

public class ComparableStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> stud = new ArrayList<>();
		stud.add(new Student(21, 100, "Jyoti"));
		stud.add(new Student(1, 150, "Ranjan"));
		stud.add(new Student(11, 300, "Krishna"));
		stud.add(new Student(22, 200, "Gopal"));
		
		Collections.sort(stud);
		
		for (Student s : stud)
		System.out.println(s);

	}

}
