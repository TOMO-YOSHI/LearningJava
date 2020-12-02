package linkedin;

public class Person {
	
	public static final int MAN = 1;
	public static final int WOMAN = 2;
	
//	final static int MAN = 1;
//	final static int WOMAN = 2;
	
	private String name;
	private int age;
	int sex;
	
	public Person(String name, int age, int sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		
		System.out.println("Hi!!!" + this.name + this.age);
	}
	
	public void sayHello() {
		System.out.println("Hello, " + "my name is " + this.name);
	}
	
	public String getName() {
		return this.name;
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
