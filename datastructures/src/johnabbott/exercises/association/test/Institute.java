package johnabbott.exercises.association.test;

import java.util.List;

public class Institute {
	private String name;
	private List<Department> departments;
	
	public Institute(String name, List<Department> deps) {
		this.name = name;
		this.departments = deps;
	}
	
	
	public void getTotalStudentNumbers() {
		
		int sum = 0;
		
		for(Department dep: departments) {
			List<Student> students = dep.getStudents();
			//sum+= students.size();
			System.out.println("department " + dep.getName() + " has " + students.size());
			for(int i=0; i< students.size(); i++) {
				System.out.println("department " + dep.getName() + " has " + students.get(i).getName());
					
			}
			
//			for(Student std: students) {
//				sum++;
//			}
		}
		
		//return sum;
	}
}
