package com.jabir.inheritance;

public class Dog extends Animal {
	
	void nature() {
		System.out.println("Loyal animal");
	}
	
	public static void main(String [] args){
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");

		Dog dg=new Dog();
		dg.nature();
		dg.eat();
		
		
	}
	

}
