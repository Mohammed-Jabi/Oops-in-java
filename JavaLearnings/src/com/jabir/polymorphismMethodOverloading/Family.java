package com.jabir.polymorphismMethodOverloading;

public class Family {
	
	void member() {
		System.out.println("New Born Baby");
	}
	
	void member(int i){
		System.out.println("Daughter");
	}
	
	void member(String s) {
		System.out.println("Son");
	}
	
	void member(String s,char c) {
		System.out.println("Father");
	}
	
	void member(char i, String s) {
		System.out.println("Mother");
	}
	
	public static void main (String [] args) {
		
		Family f=new Family();
		f.member("Father",'f');
		f.member('m',"Mother");
		f.member("Son");
		f.member(1);
		f.member();
	}
}
