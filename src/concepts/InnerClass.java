package concepts;

import concepts.Four.FourOfOne;

public class InnerClass {

	public static void main(String[] args) {
		One one = new One();
		one.printHello();
		
		Two two = new Two();
		two.randomMethod();
		
		Three three = new Three();
		three.printThree();
		
		FourOfOne four = new FourOfOne();
		four.printBye();
	}
}

// Inner Class / Nested Class
class One {
	class OneOfOne {
		class OneOfOneOfOne { 								// Nested Inner Class
			void printHello() {
				System.out.println("Hello from one");				// Step 3
			}
		}

		void printHello() {
			OneOfOneOfOne ooo = new OneOfOneOfOne();
			ooo.printHello();								// Step 2
		}

	}
	void printHello() {
		OneOfOne oo = new OneOfOne();
		oo.printHello();									// Step 1

	}
}


//Class inside Method  / Local Class
class Two {
	void randomMethod() {
		class TwoOfOne {
			void printHello() {
				System.out.println("Hello from two");
			}
		}

		TwoOfOne to = new TwoOfOne();
		to.printHello();
	}

//	TwoOfOne t = new TwoOfOne();
}

// Anonymous Inner Class
interface InterfaceOne {
	void printGood();
}
class Three {	
	void printThree(){
		InterfaceOne three = new InterfaceOne() {
			@Override
			public void printGood() {
				System.out.println("Three");
			}
		};
		
		three.printGood();
		three1.printGood();

	}
	
	InterfaceOne three1 = new InterfaceOne() {
		@Override
		public void printGood() {
			System.out.println("Three1");
		}
	};
	
}


// static nested class
class Four {
	static class FourOfOne {
		void printBye() {
			System.out.println("Bye");
		}
	}
}