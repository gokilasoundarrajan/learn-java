package basics;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterDemo id = new InterDemo();
		id.printHello();
		id.printBlock();
		InterfaceDemo.print();			// access static method
		int y = InterfaceDemo.x;
		y = id.x;
		y = InterDemo.x;
	}

}

interface InterfaceDemo {
	public static final int x = 0;
	static void print() {
		System.out.println("Static Block");
	}
	default void printBlock(){
		System.out.println("Default Block1");
	}
	void printHello();
}

interface InterfaceDemo2 {
	
	default void printBlock(){
		System.out.println("Default Block2");
	}
	void printHello();
}

class InterDemo implements InterfaceDemo, InterfaceDemo2 {
	static {
		System.out.println("class: Static Block");
	}
	InterDemo() {
		System.out.println("InterDemo");
	}
	
	public void print() {
		int y = x;
	}
	
	@Override
	public void printHello() {
		System.out.println("Hello");
	}
	@Override
	public void printBlock() {
		InterfaceDemo.super.printBlock();
	}

}