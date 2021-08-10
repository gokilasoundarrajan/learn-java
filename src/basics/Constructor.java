package basics;

public class Constructor {

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample('a');
		s1.callConstructor();
		System.out.println(s.x);
	}

}

class Sample {
	int x;

	public Sample() {
		this(5);
		System.out.println("Default Constructor");
	}

	Sample(int a) {
		System.out.println("Parameterized Constructor " + a);
	}

	private Sample(char ch) {
		this();  // calls default constructor
		System.out.println("private Constructor " + ch);
	}
	
	void callConstructor() {
		new Sample('c');
	}
}
