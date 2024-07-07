package com.krutika.design.patterns.observer;

public class MobileDisplayObserver implements DisplayObserver, DisplayElement {

	WeatherStationObservable weatherStationObservable;
	int temp;
	int humidity;

	public MobileDisplayObserver(WeatherStationObservable weatherStationObservable) {
		this.weatherStationObservable = weatherStationObservable;
		this.weatherStationObservable.addObserver(this);
	}

	@Override
	public void update() {
		this.temp = weatherStationObservable.getTemperature();
		this.humidity = weatherStationObservable.getHumidity();
		display();

	}

	@Override
	public void display() {
		System.out.println("Notification received on Mobile: temperature is now " + this.temp
				+ " degrees and humidity in air is " + this.humidity);

	}

}
