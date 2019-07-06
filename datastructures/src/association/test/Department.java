package association.test;

import java.util.List;

public class Department {
	private String name;
	private List<Student> students;
	
	public Department(String name, List<Student> stds) {
		this.name = name;
		this.students = stds;
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public String getName() {
		return name;
	}
}
