package linkedin;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Taro", 8, Person.MAN);
		
//		p.name = "Taro";
//		p.age = 8;
		
		System.out.println("getName: " + p.getName());
		
		p.sayHello();
		
		System.out.println("========================");
		
		Person p2 = PersonTest.getTaro();
	}
	
	public static Person getTaro() {
		return new Person("Taro", 8, Person.MAN);
	}

}
