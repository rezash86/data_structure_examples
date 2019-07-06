package johnabbott.exercises.bank.ploymorphism;

public class TestCheckBalance {
	public static void main(String[] args) {
		Bank bankA = new BankA();
		Bank bankB = new BankB();//Upcasting
		Bank bankC = new BankC();
		
		
		System.out.println("Deposit in bankA = " + bankA.getBalance());
		System.out.println("Deposit in bankB = " + bankB.getBalance());
		System.out.println("Deposit in bankC = " + bankC.getBalance());
	}
}
