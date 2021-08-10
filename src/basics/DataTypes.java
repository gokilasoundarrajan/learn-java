package basics;

public class DataTypes {

	public static void main(String[] args) {

		char ch = 'c';    			// 2 bytes

		byte b = 5; 				// 1 bite
		short sh = 10; 				// 2 bytes
		int i1 = 5; 				// 4 bytes
		long l1 = 888833388L; 		// 8 bytes

		float f1 = 10.2f; 			// 4 bytes
		double d1 = 923.239; 		// 8 bytes

		boolean bl = true;			// 1 byte but uses 1 bit

		Variables var = new Variables();
		var.printHi();

	}
}

class Variables {

	int a; // instance variable
	static int b; // class variable

	void printHi() {
		int c = 0; // local variable
		b = 10;

		Access acc = new Access();
		acc.accessStatic();
	}
}

class Access {
	void accessStatic() {
		Variables var = new Variables();
		var.b = 10;
		System.out.println("b: " + var.b);
	}
}
