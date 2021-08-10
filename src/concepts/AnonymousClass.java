package concepts;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ann a1 = new Ann() ;
		Ann a2 = new Ann() {
			@Override
			void printHello() {
				System.out.println("Hello from main");
			}
		};   // end with ;
		
		a1.printHello();  // Ann object
		a2.printHello();  // Overriden
	}

}

class Ann{
	void printHello() {
		System.out.println("Hello from Ann");
	}
}
