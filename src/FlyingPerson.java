package linkedin;

public class FlyingPerson extends Person implements Flyable {

	public FlyingPerson(String name, int age, int sex) {
		super(name, age, sex);
	};
	
	public void fly() {
		System.out.println("Wow, that human is flying!!");		
	}

}
