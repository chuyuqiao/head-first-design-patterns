package com.design.patterns.observer;

import org.junit.Test;

public class WeatherTest {

	@Test
	public void testWeather(){
		WeatherData weatherData=new WeatherData();
		Observer currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
