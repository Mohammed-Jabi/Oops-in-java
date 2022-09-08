package com.jabir.inheritance;

public class Cat extends Dog {
	
	public void abc() {
		System.out.println("Pet animal");
	}

	public static void main(String [] args) {
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");

		Cat ct=new Cat();
		ct.abc();
		ct.eat();
	}
}
