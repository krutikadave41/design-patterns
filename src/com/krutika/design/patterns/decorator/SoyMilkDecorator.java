package com.krutika.design.patterns.decorator;

public class SoyMilkDecorator extends CondimentDecorator{

	SoyMilkDecorator(Beverage beverage){
		this.beverage = beverage;
		this.description = this.beverage.description + " with Soy Milk";
	}
	double cost() {
		return this.beverage.cost() + 15;
	}
	@Override
	public void decorate() {
		System.out.println(this.beverage.description + " with Soy Milk");
		
	}
	
}
