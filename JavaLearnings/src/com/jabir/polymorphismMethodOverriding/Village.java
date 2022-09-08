package com.jabir.polymorphismMethodOverriding;

public class Village extends Agriculture {

	void india()throws Exception
	{
		super.india();//Use to call parent class method using child object
		System.out.println("India is full of villags");
	}
	
	void nature(String s) {
		
		System.out.println("--------------------------------");
		System.out.println("Villages are full of nature");
	}
	public static void main(String [] args) throws Exception {
		Village vi=new Village();
		Agriculture ag=new Agriculture();
		
		vi.india();
		//ag.india();
		vi.nature("Villages");
		ag.nature("nature");
	}
}
