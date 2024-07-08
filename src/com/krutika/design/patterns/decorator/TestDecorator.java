package com.krutika.design.patterns.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		System.out.println("Customer: Can I have a Latte, please?");
		System.out.println("Coffe Shop: Sure. Would you like to add extra whipped cream?");
		Beverage latte = new Latte();
		System.out.println("Customer: Yes");
		WhipCreamDecorator whipCream = new WhipCreamDecorator(latte);
		System.out.println("Customer: And some chocolate syrup please.");
		ChocolateSyrupDecorator chocolateSyrupWithCreamLatte = new ChocolateSyrupDecorator(whipCream);
		double cost = chocolateSyrupWithCreamLatte.cost();
		chocolateSyrupWithCreamLatte.decorate();
		System.out.println("Cost: "+String.valueOf(cost));
		
	}
}
