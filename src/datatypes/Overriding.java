package datatypes;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class OverrideExample{
	static void hello() {
		System.out.println("hello");
	}
	static void hello(int a) {
		System.out.println("hello " + a);	
	}
}

class OverrideA extends OverrideExample{
//	@Override
	static void hello() {
		System.out.print("hi");
	}
}