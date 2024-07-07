package com.krutika.design.patterns.observer;

public class TestObservable {

	public static void main(String[] args) {
		WeatherStationObservable observer = new WeatherStationObservable();
		DisplayObserver tvDisplayObserver = new TVDisplayObserver(observer);
		DisplayObserver mobileDisplayObserver = new MobileDisplayObserver(observer);
		observer.setWeatherData(21, 65);
		
		
	}
}
