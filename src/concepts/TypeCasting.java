package concepts;

public class TypeCasting {

	// for primitive types
	// byte, short, char, int, long, float, double
	// widening and narrowing
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.sayHello();
		animal.printAnimal();
		System.out.println("------------------");
		
		Cat cat = new Cat();
		cat.sayHello();      // method in both classes
		cat.printCat();      // method in cat
		cat.printAnimal();   // method is Animal
		System.out.println("------------------");

		// upcasting
		Animal catAnimal = new Cat();
		catAnimal.sayHello();     // method in both classes calls cat method
		catAnimal.printAnimal();  // method in Animal
//		catAnimal.printCat();     // unable to call method only in cat : compile time
		System.out.println("------------------");

		// downcasting
		Cat anotherCat = (Cat) new Animal();  
		anotherCat.sayHello();
		anotherCat.printCat();
//		anotherCat.printAnimal();				// Run time Exception: java.lang.ClassCastException
	}
}

class Animal {
	void sayHello() {
		System.out.println("Animal says Hello");
	}
	void printAnimal() {
		System.out.println("Animal");
	}
}

class Cat extends Animal{
	void sayHello() {
		System.out.println("Cat says Hello");
	}
	void printCat() {
		System.out.println("Cat");
	}
}