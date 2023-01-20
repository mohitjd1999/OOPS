package inheritance;

public class Car extends Vehicle{

	int numDoors;
	int maxSpeed;
	
	public Car() {
		System.out.println("Car's Constructor");
		
	}
	
	public void printCar() {
		super.print();
		System.out.println("Car have " + getColor() + " color, " + wheels + "wheels, " + maxSpeed + "maxSpeed, " + numDoors + "numDoors");
	}
	
	public void printMaxSpeed() {
		super.maxSpeed = 200;
		System.out.println(maxSpeed + " maxSpeed, "  + super.maxSpeed + " Vehicle maxSpeed");
	}

}
