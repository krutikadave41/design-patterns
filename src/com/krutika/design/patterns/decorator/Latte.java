package com.krutika.design.patterns.decorator;

public class Latte extends Beverage{

	Latte(){
		description = "Latte";
	}
	@Override
	double cost() {
		return 110;
	}

}
