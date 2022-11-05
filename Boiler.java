package thermometer;

public class Boiler {
	
	private boolean on ;
	private float power ;
	
	public Boiler () {
		this.on = false ;
	}
	
	public float getPower() {
		return this.power ;
	}
	
	public String toString () {
		return "this boiler is : "+(this.on ? "on" : "off");
	}
	
	public void switchOn() {
		this.on = true ;
	}
	
	public void switchOff() {
		this.on = false ;
	}
	
	public boolean isOn() {
		return this.on ;
	}
	
	public boolean isOff () {
		return !this.on ;
	}
}
