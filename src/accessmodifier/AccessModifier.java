package accessmodifier;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// default
class DefaultDemo {
	int a = 5; 											// instance varialbe

	void printDefault() {
		int b = 10; 									// local variable
		System.out.println("Default" + a + " " + b);
	}
}

// private 
class PrivateDemo {
	private int c = 5;

	private void printPrivate() {
		System.out.println("Private" + c);
	}
}

// public 
class PublicDemo {
	public int d = 55;
	public void printPublic() {
		System.out.println("Public" + d);
	}
}

// protected
class ProtectedDemo {
	protected int e = 100;
	protected void printProtected() {
		System.out.println("Protected" + e);
	}
}