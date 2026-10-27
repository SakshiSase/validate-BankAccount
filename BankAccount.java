public class BankAccount
{
	long accountNo;
	String BankName;
	private double balance;
	private int pin;

	public BankAccount( long accountNo, String BankName, double balance, int pin)
	{
		this.accountNo= accountNo;
		this.BankName = BankName;
		this.balance = balance;
		this.pin = pin;
	}

	public void checkBalance(int pin)
	{
		if(this.pin == pin)
		{
			System.out.println("Balance :" + balance);
		}
		else
		{
			System.err.println("Invalid pin"); 
		}
	}

	public void withDrawalAmount(double withDrawalAmount, int pin)
	{
		if(this.pin == pin)
		{
			if(withDrawalAmount <= 0 || withDrawalAmount >balance)
			{
				System.err.println("Invalid Amount"); 
			}
			else
			{
				balance -= withDrawalAmount;

			}
		}

		else
		{
			System.err.println("Invalid pin"); 	
		}
	}

	public void deposit(double depositAmount)
	{
		if(depositAmount <= 0)
		{
			System.err.println("Invalid Amount"); 
		}
		else
		{
			balance += depositAmount;
		}
	}

	
	
	
}