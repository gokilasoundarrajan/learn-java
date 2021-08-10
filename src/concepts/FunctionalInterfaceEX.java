package concepts;

public class FunctionalInterfaceEX {

}

@FunctionalInterface
interface InterfaceDemo {
	static void print() {
		System.out.println("Static Block");
	}

	default void printBlock() {
		System.out.println("Default Block1");
	}

	void printHello();
	
//	void sayHello();  								// cannot be added
}

class InterDemo implements InterfaceDemo {

	@Override
	public void printHello() {
		// TODO Auto-generated method stub

	}


}