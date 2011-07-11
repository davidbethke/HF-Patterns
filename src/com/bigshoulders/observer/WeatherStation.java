package com.bigshoulders.observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentCondionsDisplay currentConditionsDisplay = new CurrentCondionsDisplay(weatherData);
		CurrentCondionsDisplay currentConditionsDisplayTwo = new CurrentCondionsDisplay(weatherData);
		weatherData.setMeasurements(99, 50, 20);
		weatherData.setMeasurements(105, 45, 20);

		

	}

}
