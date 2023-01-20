package inheritance;

public class Vehicle {
	
	int maxSpeed;	
	private String color;	
	int wheels;

	public Vehicle() {
		System.out.println("Vehicle's Constructor");
		
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.println("Vehicle have " + color + "color, " + wheels + "wheels, " + maxSpeed + "maxSpeed");
	}
}
