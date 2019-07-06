package johnabbott.exercises.bank.ploymorphism;

public class BankA extends Bank {
	
	final int x;
	
	public BankA() {
		x = 10;
	}
	
	@Override
	public double getBalance() {
		Float f = new Float(10);
		return 1000;
	}
}
