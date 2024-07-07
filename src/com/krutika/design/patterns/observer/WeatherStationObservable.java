package com.krutika.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable{

	List<DisplayObserver> displayObservers = new ArrayList<DisplayObserver>();
	
	public WeatherStationObservable() {
	}

	int temperature;
	int humidity;
	@Override
	public void addObserver(DisplayObserver displayObserver) {
		displayObservers.add(displayObserver);
		
	}

	@Override
	public void removeObserver(DisplayObserver displayObserver) {
		displayObservers.remove(displayObserver);
		
	}

	@Override
	public void notifyObservers() {
		for(DisplayObserver displayObserver : displayObservers) {
			displayObserver.update();
		}
		
	}

	void setWeatherData(int temperature, int humidity){
		this.temperature = temperature;
		this.humidity = humidity;
		notifyObservers();
	}

	public int getTemperature() {
		return temperature;
	}

	public int getHumidity() {
		return humidity;
	}
	
	
}
