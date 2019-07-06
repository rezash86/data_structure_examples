package johnabbott.excersices.overloading;

public class MethodOverloading {
	public static void main(String... args) {
		
		PrintAreaOverLoading print = new PrintAreaOverLoading();

		double printAreaSquare = print.printArea(100);

		double printAreaRectangle = print.printArea(100, 200);

	}
}
