package accessmodifier;

public class StaticExample {

	public static void main(String[] args) {
		StaticDemo std = new StaticDemo();
		StaticDemo.StaticClass stc = new StaticDemo.StaticClass();
		
		// Accessing with instance
		std.printStatic2();
		stc.printStatic1();
		std.st = 555;
		
		// Accessing with Classname
		StaticDemo.printStatic2();
		StaticDemo.StaticClass.printStatic1();
		StaticDemo.st = 55;
	}

}

class StaticDemo {
	
	StaticDemo(){
		System.out.println("Static Demo Construtor");
	}
	

	// static variables
	static int st;

	// static class
	static class StaticClass {
		
		StaticClass() {
			System.out.println("StaticClass Construtor");

		}
		// static method
		static void printStatic1() {
			st = 100;
			System.out.println("static 1" + st);
		}
	}

	// static block
	static {
		System.out.println("Static Block");
		st = 55;
	}

	// static method
	static void printStatic2() {
		System.out.println("Static 2 " + st);
	}
}