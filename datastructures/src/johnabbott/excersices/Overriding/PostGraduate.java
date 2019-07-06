package johnabbott.excersices.Overriding;

public class PostGraduate extends Degree {
	
	@Override
	public void getDegree() {
		System.out.println("I am a postgraduate");
	}
}
