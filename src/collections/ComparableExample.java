package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {

		ArrayList<Staff> staffs = new ArrayList<Staff>();
		staffs.add(new Staff(1, "Ben"));
		staffs.add(new Staff(3, "Adam"));
		staffs.add(new Staff(2, "Tom"));

		Collections.sort(staffs);

		for (Staff staff : staffs)
			System.out.println(staff.id + ": " + staff.name);

	}

}

class Staff implements Comparable<Staff> {

	int id;
	String name;

	public Staff(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Staff o) {
		return this.id - o.id;				// sort by id
//		return this.name.compareTo(o.name); // sort by name
	}

}