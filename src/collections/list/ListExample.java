package collections.list;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		ListClass lc = new ListClass();
		lc.implementList();
		
		ArrayListClass alc = new ArrayListClass();
		alc.implementList();

//		LinkedListClass llc = new LinkedListClass();
//		llc.implementList();
//
//		VectorClass vc = new VectorClass();
//		vc.implementVector();
	}
}

class ListClass {
	public void implementList() {
		System.out.println("----------- List ----------------");

		List<String> list = new ArrayList<String>();
		ManipulateList manipulateList = new ManipulateList();
		
		manipulateList.addList(list);
//		manipulateList.printList(list);
		System.out.println("Elements are: " + list);
		
		manipulateList.expandList(list);
		manipulateList.collapseList(list);

	}
}



class LinkedListClass {
	public void implementList() {
		System.out.println("----------- LinkedList ----------------");

		LinkedList<String> list = new LinkedList<String>();
		ManipulateList manipulateList = new ManipulateList();
		manipulateList.addList(list);
//		manipulateList.iterateList(list);
		System.out.println("Elements are: " + list);

	}
}

class VectorClass {
	public void implementVector() {
		System.out.println("----------- Vector ----------------");

		Vector<String> vector = new Vector<String>();
		ManipulateList manipulateList = new ManipulateList();
		manipulateList.addList(vector);
//		manipulateList.iterateList(vector);
		System.out.println("Elements are: " + vector);
		
	}
}

class ManipulateList {

	void addList(List<String> list) {
		list.add("Carrot");
		list.add("Beetroot");
		list.add("Dragon Fruit");
		list.add("Egg");
		list.add("Fish");
		list.add("G");

		// Duplicates
		list.add("Apple");
		list.add("Apple");
	}

	void printList(List<String> list) {
		for (String str : list)
			System.out.println(str);
	}

	void iterateList(List<String> list) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	void listIterate(List<String> list) {
		ListIterator<String> litr = list.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		while(litr.hasPrevious()) {
			System.out.println(litr.next());
		}
	}
	
	void expandList(List<String> list) {
		System.out.println("Size Before Expansion: " + list.size());
		list.add("Ice");
		list.add("Hen");
		System.out.println("Size After Expansion: " + list.size());
		System.out.println("---------------------------");
		System.out.println("Elements are: " + list);
		System.out.println("---------------------------");
	}

	void collapseList(List<String> list) {
		System.out.println("Size Before Collapse: " + list.size());
		list.remove("Ice");
		list.remove("Hen");
		System.out.println("Size After Collapse: " + list.size());
		System.out.println("---------------------------");
		System.out.println("Elements are: " + list);
		System.out.println("---------------------------");
	}
}
