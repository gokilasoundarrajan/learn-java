package datatypes;

public class FinalClass {

	public static void main(String[] args) {
		FinalCls ffc = new FinalCls();
		ffc.a =10;
		System.out.println(ffc.a);
		
		Fc fc = new Fc();
		fc.example();
	}
	
	
}

final class FinalCls {
	int a =5;
	void doSomething() {}
}

class BC{
	int bc = 10;
	
	final void hello() {
		System.out.println("hello");
	}
}

class Fc extends BC {
	void example() {
	FinalCls fc = new FinalCls();
	fc.a = 20;
	
	BC b = new BC();
	b.bc = 20;
	
	System.out.println(fc.a + " " + b.bc);
	}
	
//	@Override
//	void hello() {
//		
//	}
}