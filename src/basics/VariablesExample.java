package basics;

public class VariablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesDemo var = new VariablesDemo();
		var.a = 5;
		var.b = 10; 
		VariablesDemo.b = 15;
	}

}

class VariablesDemo {
	// Global Variable
	int a= 10;
	
	// static variables
	static int b = 20;
	
	void print() {
		// local variable
		int c = 30;
	}
}
