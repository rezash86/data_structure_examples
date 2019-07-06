package association.test;

import java.util.ArrayList;
import java.util.List;

public class TestAggregation {
	public static void main(String[] args) {
	
		List<Student> list =new ArrayList<Student>();
		Student std1 = new Student("1", "std1");
		Student std2 = new Student("2", "std2");
		Student std3 = new Student("3", "std3");
		Student std4 = new Student("4", "std4");
		Student std5 = new Student("5", "std5");
		
		list.add(std1);
		list.add(std2);
		list.add(std3);
		list.add(std4);
		list.add(std5);
		
		
		Department dep1 = new Department("dep1", list);
		
		List<Student> list2 =new ArrayList<Student>();
		Student std21 = new Student("21", "std21");
		Student std22 = new Student("22", "std22");
		Student std23 = new Student("23", "std23");
		Student std24 = new Student("24", "std24");
		Student std25 = new Student("25", "std25");
		Student std26 = new Student("25", "std25");

		list2.add(std21);
		list2.add(std22);
		list2.add(std23);
		list2.add(std24);
		list2.add(std25);
		list2.add(std26);
		
		Department dep2 = new Department("dep2", list2);
		
		List<Department> deps = new ArrayList<Department>();
		deps.add(dep1);
		deps.add(dep2);
		
		Institute inst =  new Institute("testInst", deps);
		inst.getTotalStudentNumbers();
		
		//System.out.print("count of students   " + inst.getTotalStudentNumbers());
		
		
		
		
	}
}
