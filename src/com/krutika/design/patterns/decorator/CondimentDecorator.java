package com.krutika.design.patterns.decorator;

public abstract class CondimentDecorator extends Beverage{

	Beverage beverage;
	
	public abstract void decorate();
	
}
