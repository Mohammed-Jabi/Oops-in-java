package com.jabir.inter;

public class ProjectPh2 implements ProjectPh1{

	public void project(){
		System.out.println("Welcome");
	}
	
	public static void main(String [] args) {
		ProjectPh2 ph=new ProjectPh2();
		ph.project();
	}

}
