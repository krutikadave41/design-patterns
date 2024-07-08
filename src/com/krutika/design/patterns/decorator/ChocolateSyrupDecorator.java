package com.krutika.design.patterns.decorator;

public class ChocolateSyrupDecorator extends CondimentDecorator{

	ChocolateSyrupDecorator(Beverage beverage){
		this.beverage = beverage;
		this.description = this.beverage.description + " with Chocolate Syrup";
	}
	double cost() {
		return this.beverage.cost() + 20;
	}
	@Override
	public void decorate() {
		System.out.println(this.beverage.description + " with Chocolate Syrup");
		
	}
	
}
