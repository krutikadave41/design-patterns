package com.krutika.design.patterns.observer;

public class TestObservable {

	public static void main(String[] args) {
		WeatherStationObservable observerable = new WeatherStationObservable();
		DisplayObserver tvDisplayObserver = new TVDisplayObserver(observerable);
		DisplayObserver mobileDisplayObserver = new MobileDisplayObserver(observerable);
		observerable.setWeatherData(21, 65);
		
		
	}
}
