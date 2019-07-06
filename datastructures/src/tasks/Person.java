package tasks;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	static int counter;
	private Person ppp;
	
	
	public Person() {
		counter++;
	}
	
	public void getMe(Person p) {
		this.ppp = p;
	}
	
	
	public Person(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = 18; 
		
		counter++;
	}
	
//	//Overloading
//	public Person(String fName, String lName, int age) {
//		this.firstName = fName;
//		this.lastName = lName;
//		this.age = age;
//	}
	
	
}
