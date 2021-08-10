package concepts;

public class CustomException {

	static void validate(int age) throws MyException {
		if (age < 18)
			throw new MyException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}

}

class MyException extends Exception {
	public MyException(String string) {
		super(string);
	}
}