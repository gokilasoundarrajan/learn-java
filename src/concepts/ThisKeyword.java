package concepts;

public class ThisKeyword {

	public ThisKeyword() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {

		ThisExample t = new ThisExample();
		ThisExample th = t.printSomething();
		t.getParam(th);
		System.out.println(th.a + th.b);
	}

}

class ThisExample {
	int a, b;

	ThisExample() {
		
		// 1.1 Parameterized Constructor Call
		this(5,5);
		System.out.println("Default");

	}

	ThisExample(int a, int b) {
		// 1. Constructor Call
//		this();
		
		// 2. access field
		this.a = a;
		this.b = b;
		
		System.out.println("A: " + this.a);
		System.out.println("B: " + this.b);

	}
	
	// As Constructor argument
	ThisExample(ThisKeyword th){
		
	}
	
	ThisExample printSomething() {		
		// 3. Return current instance
		System.out.println("Something");
		return this;
	}
	
	
	// 4. As Method Param
	void getParam(ThisExample ths) {

		// 5. call current obj method
		this.printSomething();
		System.out.println(ths.a);
	}

}