package basics.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hi";
		String str2 = "hi";
		System.out.println(str1 == str2);					// true
		System.out.println(str1.equals(str2));				// true

				
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		// SB does not override equals method
		// equivalent to (sb1 == sb2)
		System.out.println(sb1.equals(sb2));				// false 
		
		String str3 = "hello world";
		StringBuilder sb3 = new StringBuilder("hello world");
		System.out.println(str3.equals(sb3));				// false
		System.out.println(str3.equals(sb3.toString()));	// true

		
	}

}

class StringBuilderSolution {
	
}
