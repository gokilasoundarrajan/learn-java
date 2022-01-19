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
		System.out.println("StaticDemo1 Constructor");   	// 6
	}
	
	static {
		System.out.println("Static1");   					// 3
	}
	
	{
		System.out.println("Instance Block1");				// 5
	}
}

class StaticDemo2 extends StaticDemo1 {
	StaticDemo2(){
		System.out.println("StaticDemo2 Constructor");   	// 8
	}
	
	static {
		System.out.println("Static2");   					// 4
	}
	
	{
		System.out.println("Instance Block2");				// 7
	}
}