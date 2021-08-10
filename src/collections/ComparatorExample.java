package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Ben"));
		students.add(new Student(3, "Adam"));
		students.add(new Student(2 , "Tom"));
		
		Collections.sort(students, new IdComparator());		
		for(Student student: students) {
			System.out.println(student.id + ": " + student.name);
		}
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
} 

class IdComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		// negative if s1 < s2
		// 0 if s1 = s2
		// positive if s1 > s2
		
//		return s1.id - s2.id;
		return Integer.compare(s1.id, s2.id);
		
	}
}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}