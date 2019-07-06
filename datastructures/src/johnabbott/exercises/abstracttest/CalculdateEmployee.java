package johnabbott.exercises.abstracttest;

public class CalculdateEmployee extends BaseCalculate {

	@Override
	public void calculate() {
		double baseSalary = getBaseSalary();
		double employeeSalary = baseSalary + 4000;
		System.out.println(employeeSalary);
	}

	
	
	
}
