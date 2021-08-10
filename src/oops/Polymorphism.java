package oops;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyA a = new PolyA();
		a.printHello();
		PolyA b = new PolyB();
		b.printHello();
		
		b.add(5,5);					// parent method
//		b.hello();					// not possible
		
		PolyB bb = new PolyB();
		bb.printHello();			// in both class : calls child class
		bb.add(10, 10);				// in parent class
		bb.hello();					// in child class
	}

}

class PolyA {
	void printHello() {
		System.out.println("Hello A");
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
//	incorrect
	
//	int add(int a, int b) {
//		System.out.println(a+b);
//		return 1;
//	}
	int add(int a, int b, int c) {
		System.out.println(a+b);
		return 1;
	}
}

class PolyB extends PolyA {
	@Override
	void printHello() {
		System.out.println("Hello B");
	}
	
	void hello() {
		System.out.println("Hello");
	}
}
