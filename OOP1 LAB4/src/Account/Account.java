package Account;

public class Account {
	
	String accName;
	String acid;
	int balance;
	
	public Account() {
		
	}
	public Account(String accName, String acid, int balance) {
		super();
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount)
	{
		balance = balance + amount;
	}

	public void withdraw(int amount)
	{
		balance = balance - amount;
	}
	

}
