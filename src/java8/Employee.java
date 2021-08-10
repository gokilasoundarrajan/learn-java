package java8;

public class Employee {

	Integer id;
	Integer age;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	public Employee(Integer id, Integer age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
}
