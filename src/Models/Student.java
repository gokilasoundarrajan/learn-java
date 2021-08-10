package Models;

public class Student implements Comparable<Student>{

	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
//		return this.id - o.id;
		return this.name.compareTo(o.name);
	}

} 
