package johnabbott.excersices.Overriding;

public class Undergraduate extends Degree {

	@Override
	public void getDegree() {
		System.out.println("I am an undergraduate");
	}
}
