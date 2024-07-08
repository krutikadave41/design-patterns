package com.krutika.design.patterns.decorator;

public class Capaccino extends Beverage{

	Capaccino(){
		description = "Capaccino";
	}
	@Override
	double cost() {
		return 50;
	}

}
