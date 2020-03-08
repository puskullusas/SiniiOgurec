package Singleton;

public class Person {
	String name;
	int age;
	private static Person instance;

	private Person() {//constructor
	}

	public static Person getInstance() {
		if (instance == null) {
			instance = new Person();
		}
		return instance;
	}

	public void display() {
		System.out.println("Name: " + name + " age: " + age);
	}

}
