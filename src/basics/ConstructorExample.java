package basics;

public class ConstructorExample {

	public static void main(String[] args) {

		ConstructClass cc = new ConstructClass();

		ConstructClass cc1 = new ConstructClass(5);

		ConstructClass cc2 = new ConstructClass(cc1);

		System.out.println("a: " + cc2.a);
		System.out.println("ch: " + cc2.ch);

	}

}

class ConstructClass {

	int a;
	char ch;
	static int b;
//	ConstructClass(){
//		System.out.println("In Default Constructor");
//	}

	// 1. Default Constructor
	// public, private, default, protected
//	protected ConstructClass(){
//		System.out.println("In Default Constructor");
//	}

	// 2. Parameterized constructor
	ConstructClass(int a) {
		this(); // calling default constructor
		this.a = a;
	}

	// 3. Copy constructor
	ConstructClass(ConstructClass cc) {
		this.a = cc.a;
	}

	// 4. Static constructor
	public ConstructClass() {
		System.out.println("Static Constructor of the class");
	}

	// 5. Private constructor
}
