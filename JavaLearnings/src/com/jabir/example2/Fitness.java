package com.jabir.example2;

class Fitness {
	String goal;
	int days;
	String gain;
	int kg;
	
	void aim(String g,int k) {
		gain=g;
		kg=k;
	}
	void display() {
		System.out.println(gain+" "+kg+"kg");
	}

	public static void main(String[] args) {

		Fitness ft = new Fitness();
		ft.goal = "Gain healthy weight";
		ft.days = 30;
		System.out.println(ft.goal + " in " + ft.days + " days");
		ft.aim("Muscular weight",10);
		ft.display();
	}
}