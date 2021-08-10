package datastructures;

public class Arrays {

	public static void main(String[] args) {

		int[] num = { 2, 4, 8, 10 };
		DoWithArray doArray = new DoWithArray();
		System.out.println(num);
		int[] newNum = doArray.insertElement(5, 2, num);
		for (int i : newNum)
			System.out.println(i);
	}
}

class DoWithArray {

	int[] insertElement(int element, int index, int[] arr) {
		int[] newNum = new int[arr.length + 1];
		for (int i = newNum.length - 1; i >= 0; i--) {
			if (i == index) {
				newNum[i] = element;
			}
			else if (i > index)
				newNum[i] = arr[i - 1];
			else
				newNum[i] = arr[i];
		}
		return newNum;
	}
}