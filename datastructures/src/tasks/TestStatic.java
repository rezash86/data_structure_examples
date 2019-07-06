package tasks;

import java.util.Scanner;

public class TestStatic {
	
	int instanceVariable;
	
	public static void test1() {
		
		System.out.print("test 1");
	}
	
	
	public void test2() {
		instanceVariable = 10;
	}
	
	
	
	
	
	public static void main(String...args) {
//		Person p1 = new Person("TOTO1", "TOTO2");
//		Person p2 = new Person("TOTO2", "TOTO2");
//		Person p3 = new Person("TOTO2342", "TOTO2");
//		Person p4 = new Person("TOT2342", "TOTO2");
//		Person p5 = new Person("TOTO1234", "TOTO2");
		
//		System.out.print(Person.counter);
	
		
		System.out.print("How many Persons you want to create");
		Scanner scan = new Scanner(System.in);
		int countPersons = scan.nextInt();
		
		for(int i=0; i<countPersons; i++) {
			Person p =new Person();
		}
		
		System.out.print(Person.counter);
		
		Person ppp = new Person();
		ppp.getMe(ppp);
		

	}
}
