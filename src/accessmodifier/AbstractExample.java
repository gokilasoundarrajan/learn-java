package accessmodifier;

public class AbstractExample {
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		nc.printAbstract();
	}
}

abstract class AbstractDemo {
	int a = 5;
	abstract void printAbstract();
}	

class NewClass extends AbstractDemo{
	
	abstract class Abs1{
		void printAbstract() {
			a = 35;
			System.out.println("Abstract " + a);
		}
	}

	@Override
	void printAbstract() {
		a = 25;
		System.out.println("Abstract " + a);
	}
	
}