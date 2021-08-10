package accessmodifier;

public class StaticBlock {
	// static variable
	static int j = 10;
	static int n;

	// static block
	static {
		System.out.println("Static block.");				// 1 
		n = j * 8;
	}

	public static void main(String[] args) {				// 2
		System.out.println("Inside main method");
		System.out.println("Value of j : " + j);
		System.out.println("Value of n : " + n);
		
		StaticDemo2 sd = new StaticDemo2();
	}
}

class StaticDemo1 {
	StaticDemo1(){
		System.out.println("StaticDemo1 Constructor");   // 2
	}
	
	static {
		System.out.println("Static1");   // 2
	}
	
	{
		System.out.println("Instance Block1");					// 1
	}
}

class StaticDemo2 extends StaticDemo1 {
	StaticDemo2(){
		System.out.println("StaticDemo2 Constructor");   // 2
	}
	
	static {
		System.out.println("Static2");   // 2
	}
	
	{
		System.out.println("Instance Block2");					// 1
	}
}