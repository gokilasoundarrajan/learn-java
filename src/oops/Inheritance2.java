package oops;

public class Inheritance2 {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.makeSound();

		// polymorphism
		Animal dog = new Dog();
		Animal cat = new Cat();	
		
		Cat cat1 = new Cat();
		
		cat = cat1;
		
		dog.makeSound();
		cat.makeSound();
		
//		dog.printDog();
		
	}
}

class Animal {
	Animal(){
		System.out.println("Animal");
	}
	protected void makeSound() {
		System.out.println("default MakeSound");
	}
	void printAnimal() {
		System.out.println("Printing Animal");
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("Dog\n");
	}
	public void makeSound() {
		System.out.println("\nBark");
	}
	void printDog() {
		System.out.println("Printing Dog");
	}
}

class Cat extends Animal {
	Cat() {
		System.out.println("Cat\n");
	}
	public void makeSound() {
		System.out.println("Meow");
	}
}