package linkedin;

abstract public class HybridCar extends Car {
	
	public HybridCar(String color) {
		super(color);
	}
	
	
	public void drive(double d){
		
		super.drive(d);
		this.useEnergy(d);
//		System.out.println("============================");
//		System.out.println("Hybrid car is environmentally friendly!!");
//		System.out.println("The car drove " + d);
//		System.out.println("The total distance is " + distance);
	}

	abstract void useEnergy(double d);

}
