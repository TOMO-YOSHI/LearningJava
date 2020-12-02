package linkedin;

public class FlyingPraus extends Praus implements Flyable {

	public FlyingPraus(String color) {
		super(color);
	}

	public void fly() {
		System.out.println("The Praus flew!!!");
	}

}
