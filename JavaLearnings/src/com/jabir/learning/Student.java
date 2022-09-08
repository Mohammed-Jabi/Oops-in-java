package com.jabir.learning;

public class Student {
	
	int numbers;
	String names;
	float marks;
	
	
	void greating() {
		
	System.out.println("HELLOW "+this.names);
		
	}
	
	void changeName(String newName) {
		
		names = newName;
		
	}
	
	
	
	Student(){
		 this.numbers=33;
		 this.names="Mohammed Izhaar";
		 this.marks=90;
		
	}
	
	Student (Student others){
		 this.numbers= others.numbers;
		 this.names= others.names;
		 this.marks= others.marks;
		
	}
	
	Student(int numbers, String name, float marks){
		 this.numbers=33;
		 this.names="Mohammed Izhaar";
		 this.marks=90;
	

}
}