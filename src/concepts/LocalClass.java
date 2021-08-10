package concepts;

public class LocalClass {
	public static void main(String[] args) {
		RandomClass rc = new RandomClass();
		rc.doRandomStuff();
	}
	
}

class RandomClass {
	void doRandomStuff() {
		System.out.println("inside doRandomStuff() method");
		class LocalClassExample {
			int x = 25;
			void printX() {
				System.out.println(x);
			}
		}
		LocalClassExample lcex = new LocalClassExample();
		lcex.printX();
	}
}
