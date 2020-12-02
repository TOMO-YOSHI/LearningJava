package linkedin;

public class Praus extends HybridCar{

	public Praus(String color) {
		super(color);
	}

	@Override
	void useEnergy(double d) {
		System.out.println("The energy was used to run " + d + "km.");
	}

	@Override
	public void drive(double d) {
		
		System.out.println("=======================================");
		System.out.println(this.color + "'s Praus is running!");
		
		super.drive(d);
	}
	
	

}
