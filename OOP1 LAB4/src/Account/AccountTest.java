package Account;

public class AccountTest {
	
	public static void main(String[] args) {

	Account a1 = new Account("jahidul","11o",0);
	
	a1.deposit(1200);
	a1.withdraw(300);
	System.out.println(a1.getAccName() + " " + a1.getAcid()+" " + a1.getBalance());
	System.out.println();
	
	
}
}