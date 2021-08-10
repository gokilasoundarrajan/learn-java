package basics.string;

public class StringMethods {

	public static void main(String[] args) {
		String st1 = "  hello   ";
		System.out.println(st1 + "how are you"); // without trim()
		System.out.println(st1.trim() + "how are you"); // with trim()

		System.out.println("-------------------------------");
	}
}
