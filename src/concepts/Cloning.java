package concepts;

public class Cloning {

	public static void main(String[] args) {
		CloneThisClass cl1 = new CloneThisClass();
		cl1.a = 10;
		System.out.println("CL1 a: " + cl1.a);

		// --- Shallow Copy ----
		System.out.println("--- Shallow Copy ----");

		CloneThisClass cl2 = new CloneThisClass();
		cl2 = cl1;
		
		System.out.println(cl1 == cl2);
		cl2.a = 50;
		System.out.println("CL2 a: " + cl2.a);

		System.out.println("CL1 a: " + cl1.a);

		// --- Deep Copy ----
		System.out.println("--- Deep Copy ----");
		CloneThisClass cl3 = new CloneThisClass();
		cl3.a = cl1.a;
		
		System.out.println("CL2 a: " + cl3.a);

		System.out.println("CL1 a: " + cl1.a);
		
		cl3.a = 55;
		System.out.println("--- After Changing ----");
		System.out.println("CL2 a: " + cl3.a);

		System.out.println("CL1 a: " + cl1.a);
		
		//  --- Cloning ----
		try {
			CloneThisClass cloneThis = (CloneThisClass) cl1.clone();
			cloneThis.a = 101;
			System.out.println("--- After Cloning ----");
			System.out.println("cloneThis a: " + cloneThis.a);
			System.out.println("CL1 a: " + cl1.a);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CloneThisClass implements Cloneable {
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	int a;
	int b;
}