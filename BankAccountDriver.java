public class BankAccountDriver{
	public static void main(String[] args)
	{
		BankAccount ba = new BankAccount(565756555256l, "IDBI", 7000, 1105);
		
		ba.checkBalance(1105);
		
		ba.withDrawalAmount(500,1105);
		
		ba.checkBalance(1105);
		
		ba.deposit(1000);

		ba.checkBalance(1105);
	}

}