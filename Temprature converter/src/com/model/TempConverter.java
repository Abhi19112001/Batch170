package com.model;

public class TempConverter {
	float fartocel;
	float celtofar;
	//from fahrenhite to celcius
	public void tempcon(float temp) {
	fartocel=(temp-32)*5/9;
	System.out.println("The temp value in celcius is:- "+ fartocel+" °C");

}
	
	public void tempco(float temp) {
		celtofar=(temp*9/5)+32;
		System.out.println("The temp value in fahrenhite is:- "+celtofar+" °F");
	}
}
