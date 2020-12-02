package linkedin;

abstract public class GasCar extends Car {
	
	public GasCar(String color) {
		super(color);
	}
	
	public void drive(double d){
		
		super.drive(d);	
		this.useGas(d);
		
//		System.out.println("============================");
//		System.out.println("Gas car ran by gas!!");
//		System.out.println("The car drove " + d);
//		System.out.println("The total distance is " + distance);
	}
	
	abstract void useGas(double d);
}