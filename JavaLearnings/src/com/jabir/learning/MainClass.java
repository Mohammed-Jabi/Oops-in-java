package com.jabir.learning;

public class MainClass {

	public static void main(String[] args) {
		
		
		//int[] numbers = new int[5];
		
		//String[] names = new String[5];
		
		//Student[] Student = new Student[5];
		
		Student Jabir = new Student();
		Student Izhaar = new Student(33,"Mohammed Izhar ul Haq",90);
		Student Random=new Student(Jabir);
		
		
		Jabir.changeName("Mohammed Mair");
		Jabir.greating();
		
		Jabir.numbers = 34;
		Jabir.names = "Mohammed Jabir";
		Jabir.marks = 89;
		
		
		System.out.println(Jabir.numbers);
		System.out.println(Jabir.names);
		System.out.println(Jabir.marks);
		
		
	}
	

}
