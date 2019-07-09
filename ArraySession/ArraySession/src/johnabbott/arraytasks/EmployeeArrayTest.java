package johnabbott.arraytasks;

public class EmployeeArrayTest {

	public static void main(String[] args) {
		Employee emp1= new Employee("emp1", 100); 
		Employee emp2= new Employee("emp2", 200);
		Employee emp3= new Employee("emp3", 300);
		Employee emp4= new Employee("emp4", 400);
		
		
		Employee[] empArrays = new Employee[4];
		
		empArrays[0] = emp1; 
		empArrays[1] = emp2;
		empArrays[2] = emp3;
		empArrays[3] = emp4;
		
		
		for (Employee employee : empArrays) {
			System.out.println(employee.getName() + "  "+ employee.getSalary());
		}
		
	}
}
