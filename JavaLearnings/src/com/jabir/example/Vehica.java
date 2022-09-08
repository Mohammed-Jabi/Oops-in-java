package com.jabir.example;

public class Vehica 
{

String type;
int model;
int price;
String origen;


public static void main(String [] args){

Vehica vv=new Vehica();
vv.type="two wheel";
vv.model=2022;

Benz bz=new Benz();

bz.action();
System.out.println(vv.type+" "+vv.model);

bz.color();
bz.initObj("White");
bz.colo();
		/* bz.action(); */

vv.price=500000;
vv.origen="India";
System.out.println(vv.price+"/n "+vv.origen);
}

}
