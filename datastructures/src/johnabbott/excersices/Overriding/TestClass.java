package johnabbott.excersices.Overriding;

public class TestClass {
	
	
	public static void main(String...strings) {
		//Undergraduate graduate = new Undergraduate();
		System.out.println("-----under graduate graduate----");
		Degree underGraduate = new Undergraduate();//Upcasting
		underGraduate.getDegree();		
		
		System.out.println("-----Post graduate----");
		Degree postGraduate = new PostGraduate();
		postGraduate.getDegree();
		
		
	}
}
