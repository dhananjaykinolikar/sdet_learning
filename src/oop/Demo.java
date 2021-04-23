package oop;


 class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		
		System.out.println("I am Walking");
		
	}
	
	void eat() {
		System.out.println("I am eating");
	}
	
	void sleep() {
		System.out.println("I am sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		//initiating object
		Person person1 = new Person();
		
		//Define some properties
		person1.name="Jon";
		person1.email="jon@gmail.com";
		person1.phone="7894561237";
		
		//Abstraction		
		person1.walk();
		person1.eat();



	}

}


