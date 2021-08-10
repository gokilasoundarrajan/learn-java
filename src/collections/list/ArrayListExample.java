package collections.list;

import java.util.ArrayList;
import java.util.Collections;

import Models.Student;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListClass alc = new ArrayListClass();
		alc.implementList();
	}
}

class ArrayListClass {
	public void implementList() {
		System.out.println("----------- ArrayList ----------------");
		ArrayList<String> list = new ArrayList<String>();
		ManipulateList manipulateList = new ManipulateList();
		manipulateList.addList(list);
		Collections.sort(list);
		System.out.println(list.get(2));
		list.add(2, "Bell Pepper");
		System.out.println("Elements are: " + list);
//		manipulateList.listIterate(list);
	}

	public void objectList() {
		System.out.println("----------- ArrayList ----------------");
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(1, "Tom"));
		list.add(new Student(2, "Ann"));
		list.add(new Student(3, "Mike"));
		list.add(new Student(4, "Ben"));
		
		Collections.sort(list);
		
		for(Student student: list)
			System.out.println(student.id + ": " + student.name);

	}
}