package day01;

public class Lamp {

	boolean isOn;
	
	void turnOn() {
		isOn = true;
		System.out.println("Light on? " + isOn);
	}
	
	void turnOff() {
		isOn = false;
		System.out.println("Light off? " + isOn);
	}
}
