package com.jabir.constructors;

public class College {
	
	String name;
	String address;
	double number;
	
	public College(String name,String address,double number){
		this.name=name;
		this.address=address;
		this.number=number;
		
	}
	
	public static void main(String [] args) {
		
		College col=new College("VVIT","DodaGubbi",0000000000);
		
		System.out.println(col);
		
		
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + ", number=" + number + "]";
	}

}
