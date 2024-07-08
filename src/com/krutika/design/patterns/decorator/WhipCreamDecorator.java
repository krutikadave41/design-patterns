package com.krutika.design.patterns.decorator;

public class WhipCreamDecorator extends CondimentDecorator{

	WhipCreamDecorator(Beverage beverage){
		this.beverage = beverage;
		this.description = this.beverage.description + " with Whipped Cream";
	}
	double cost() {
		return this.beverage.cost() + 10;

	}
	@Override
	public void decorate() {
		System.out.println(this.beverage.description + " with Whipped Cream");
		
	}
	
}
