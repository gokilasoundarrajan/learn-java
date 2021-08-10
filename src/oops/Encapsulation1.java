package oops;

public class Encapsulation1 {

	public static void main(String[] args) {
		ClassA classA = new ClassA();
		System.out.println(classA.getA());
		classA.setA('a');
		System.out.println(classA.getA());
		
	}
}

class ClassA {
	
	// private varibles
	private char A;
	
	ClassA() {
		A = 'A';
	}
	
	// public getter and setter
	public char getA() {
		return A;
	}
	
	public void setA(char A) {
		this.A = A;
	}
			
}
