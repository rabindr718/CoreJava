package ArrayList.Implementations;
import java.util.ArrayList;
import java.util.List;
public class CreateObjectofEmployeeArrayList {

	public static void main(String[] args) {
		Employee e1 = new Employee("Rabindra");
		Employee e2 = new Employee("Kumar");
		Employee e3 = new Employee("Sharma");

		List<Employee> employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		for (Employee employee: employeeList) {
			System.out.println(employee.name);
		}
	}
}

class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}
}
