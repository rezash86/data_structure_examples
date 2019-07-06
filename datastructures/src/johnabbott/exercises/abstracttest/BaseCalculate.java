package johnabbott.exercises.abstracttest;

public abstract class BaseCalculate {
	
	private final double baseSalary = 10000;
	
	//this method is an abstract
	public abstract void calculate();
	
	public double calculateSalary() {
		return baseSalary;
	}
	
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
}
