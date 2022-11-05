package thermometer;

import java.awt.Color;

public class Thermometer {
	
	private float temperature ;
	
	public Thermometer (float tempInit) {
		
		this.temperature = tempInit ;
	}
	
	public Thermometer () {
		
		this.temperature = 0 ;
	}
	
	public String toString() {
		
		return "The current temperature is  " + this.temperature ;
	}
	
	public float inCelcius() {
		
		return this.temperature ;
	}
	
	public void changeTemperature(float newTemp) {
		
		this.temperature = newTemp ;
	}
	
	public float inFahrenheit() {
		
		return (9/5) * this.temperature + 32 ;
	}
	
	
	public Color displayColor () {
		
		if (this.temperature < COLD_LIMIT) {
			return COLD_COLOR ;
		}
		
		else if (this.temperature < HOT_LIMIT) {
			return TEMPERATE_COLOR ;
		}
		
		else {
			return HOT_COLOR ;
		}
	}
	private static int COLD_LIMIT = 10;
    private static int HOT_LIMIT = 30;

    private static Color COLD_COLOR = Color.BLUE;
    private static Color TEMPERATE_COLOR = Color.GREEN;
    private static Color HOT_COLOR = Color.RED;

}
