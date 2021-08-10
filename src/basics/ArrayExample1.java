package basics;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] zeroArr = new int[0];
		
		int[] myArr = { 1, 2, 3, 4, 5 };
		ChangeIt.makeNull(myArr);
		System.out.println(myArr);
		ChangeIt.changeValue(myArr);
		// Print Array
		for (int i = 0; i < (myArr.length); i++)
			System.out.println(myArr[i]);
	}

}

class ChangeIt {
	static void makeNull(int[] z) {
		System.out.println(z);
//		z = new int[0];		
//		z = null;	
	}

	static void changeValue(int[] z) {
		System.out.println(z);
		int[] A = z;
		A[0] = 99;
	}
}
