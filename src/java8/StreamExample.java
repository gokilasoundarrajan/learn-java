package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, 25, "John"));
		employees.add(new Employee(2, 50, "Jeff"));
		employees.add(new Employee(3, 35, "Mike"));
		employees.add(new Employee(4, 20, "Lia"));
		employees.add(new Employee(5, 25, "Tom"));
		StreamDemo stmDemo = new StreamDemo();
		stmDemo.filterList(employees);
	}

}

class StreamDemo {
	void filterList(List<Employee> employees) {
//		Stream.of(employees);
//		employees.stream();
		List<Employee> result = employees.stream().filter(e -> e.age > 35).collect(Collectors.toList());
		for (Employee emp : result)
			System.out.println(emp.id);

		List<String> names = employees.stream().map(e -> e.name).collect(Collectors.toList());
		System.out.println(names);

		List<String> name = employees.stream()
				.filter(e -> e.getAge() > 35)
				.map(m -> m.getName())
				.collect(Collectors.toList());
		System.out.println(name);

		List<String> nam = employees.stream()
				.filter(e -> e.getAge() > 20)
				.map(m -> m.getName())
				.filter((n) -> n.startsWith("J"))
				.collect(Collectors.toList());
		System.out.println(nam);

	}
}
