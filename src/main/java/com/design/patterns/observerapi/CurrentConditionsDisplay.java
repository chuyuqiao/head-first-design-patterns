package com.design.patterns.observerapi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

	private float temp;
    private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable){
    	this.observable=observable;
    	observable.addObserver(this);
    }
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			this.humidity=weatherData.getHumidity();
			this.temp=weatherData.getTemp();
			display();
		}

	}
	
	public void display() {
		System.out.println("Cuttent conditions:" + temp + "F degrees and " + humidity + "% humidity");
	}

}
