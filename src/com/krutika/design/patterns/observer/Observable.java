package com.krutika.design.patterns.observer;

public interface Observable {

	void addObserver(DisplayObserver displayObserver);
	
	void removeObserver(DisplayObserver displayObserver);
	
	void notifyObservers();
	
}
