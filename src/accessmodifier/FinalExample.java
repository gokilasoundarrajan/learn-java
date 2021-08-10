package accessmodifier;

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo finalDemo = new FinalDemo();
		finalDemo.printFinal();
	}

}
				
// cannot be inherited
final class FinalDemo {		
	// cannot be modified
	final int a =5;
	
	// cannot override
	final void printFinal() {
		System.out.println("Final " + a);
	}
}