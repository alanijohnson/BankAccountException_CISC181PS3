package CISC181.Week3.Package4;

public class Test {

	public static void main(String[] Args) throws InsufficientFundsException{
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(10);
		System.out.println("Balance: "+account1.getBalance()
				+"\nMonthly Interest Rate: " +account1.getMothlyInterestRate()
				+"\nDate account created: "+account1.getDateCreated());
		account1.withdraw(2500);
		System.out.println("Balance: "+account1.getBalance());
		account1.deposit(3000);
		System.out.println("Balance: "+account1.getBalance());
		account1.withdraw(40000);
	}
}
