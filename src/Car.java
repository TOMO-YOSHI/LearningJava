package linkedin;

abstract public class Car {
	
	double distance = 0.0;
	String color = "";
	
	public Car(String color) {
		this.color = color;
	}
	
	public void drive(double d) {
		
		this.distance += d;
//		System.out.println("-----------------------------");
//		System.out.println("The car ran " + d + "km");
//		System.out.println("Total distance is " + this.distance);
	}
}
