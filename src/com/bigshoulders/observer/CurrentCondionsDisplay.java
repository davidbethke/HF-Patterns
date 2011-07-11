package com.bigshoulders.observer;

public class CurrentCondionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentCondionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void display() {
		System.out.println("Current conditions:"+ temperature +"F degrees"+ humidity+"%humidity");

	}

	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

}
