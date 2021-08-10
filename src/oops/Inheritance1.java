package oops;

public class Inheritance1 {

	public static void main(String[] args) {
		B objB = new B();
		objB.printA();
		objB.printB();
	}
}

class A {
	char a = 'a';
	A() {
		System.out.println("Construcor A");
	}
	public void printA() {
		System.out.println("a: " + a);
	}
}

class B extends A {
	char b = 'b';
	B() {
		System.out.println("Construcor B");
	}
	public void printB() {
		System.out.println("b: " + b);
	}
}