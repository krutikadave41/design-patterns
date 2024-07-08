package com.krutika.design.patterns.decorator;

public class Espresso extends Beverage{

	Espresso(){
		description = "Espresso";
	}
	@Override
	double cost() {
		return 100;
	}

}
