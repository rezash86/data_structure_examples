package johnabbott.arraytasks;

public class ArrayObjects {
	
	public static void main(String[] ardgsss) {
		
		Student st1 = new Student(1, "John");
		Student st2 = new Student(2, "Jack");
	
		//each element will have a reference to the memory 
		Student[] arrStds = new Student[2];
		arrStds[0] = st1;
		arrStds[1] = st2;
		
		
		for(int i=0; i< arrStds.length ; i++) {
			
			System.out.println(arrStds[i].getName());
			
		}
	}
}
