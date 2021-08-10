package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {

		// Random Order
//		SetClass sc = new SetClass();
//		sc.implementSet();

		// Random Order
		HashSetClass hsc = new HashSetClass();
		hsc.implementSet();

		// Insertion Order
//		LinkedHashSetClass lhs = new LinkedHashSetClass();
//		lhs.implementSet();

		// Natural Ordering
//		TreeSetClass ts = new TreeSetClass();
//		ts.implementSet();
	}
}

class SetClass {
	void implementSet() {
		System.out.println("----------- Set ----------------");
		HashSet<String> set = new HashSet<String>();
		ManipulateSet manipulateSet = new ManipulateSet();
		manipulateSet.maipulateSet(set);
		System.out.println("Elements are: " + set);
	}
}

class HashSetClass {
	void implementSet() {
		System.out.println("----------- HashSet ----------------");
		HashSet<String> hashSet = new HashSet<String>();
		ManipulateSet manipulateSet = new ManipulateSet();
		manipulateSet.maipulateSet(hashSet);
		hashSet.add("lemon");
		hashSet.add(null);
		System.out.println("Elements are: " + hashSet);
	}
}

class LinkedHashSetClass {
	
	void implementSet() {
		System.out.println("----------- LinkedHashSet ----------------");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		ManipulateSet manipulateSet = new ManipulateSet();
		manipulateSet.maipulateSet(linkedHashSet);
	}
}

class TreeSetClass {
	void implementSet() {
		System.out.println("----------- TreeSet ----------------");
		TreeSet<String> treeSet = new TreeSet<String>();
		ManipulateSet manipulateSet = new ManipulateSet();
		manipulateSet.maipulateSet(treeSet);
	}
}

class ManipulateSet {

	void maipulateSet(Set<String> set) {
		createSet(set);
		expandSet(set);
		collapseSet(set);
		printSet(set);
//		iterateSet(set);
	}

	void createSet(Set<String> set) {
		set.add("Carrot");
		set.add("Beetroot");

		// Duplicates
		set.add("Apple");
		set.add("Apple");
		set.add("Apple");

		set.add("Dragon Fruit");
		set.add("Egg");
		set.add("Fish");
		set.add("G");
		System.out.println("Set Created");
		System.out.println("---------------------------");

	}

	void printSet(Set<String> set) {
		System.out.println("-------------Printing--------------");

		for (String str : set)
			System.out.println(str);

		System.out.println("---------------------------");
	}

	void iterateSet(Set<String> set) {
		System.out.println("-------------Iterating--------------");

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");

	}

	void expandSet(Set<String> set) {
		System.out.println("Size Before Expansion: " + set.size());
		set.add("Ice");
		set.add("Hen");
		System.out.println("Size After Expansion: " + set.size());
		System.out.println("---------------------------");
		System.out.println(set);
		System.out.println("---------------------------");
	}

	void collapseSet(Set<String> set) {
		System.out.println("Size Before Collapse: " + set.size());
		set.remove("Ice");
		set.remove("Hen");
		System.out.println("Size After Collapse: " + set.size());
		System.out.println("---------------------------");
		System.out.println(set);
		System.out.println("---------------------------");
	}
}