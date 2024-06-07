package BackActivety;

public class Trasction implements bank {
	public void deposite(Account acc,int amt)
	{
		int newbal =acc.getBalance() +amt;
		acc.setBalance(newbal);
		System.out.println("Balance deposited");
		
	}
	public void withdraw(Account acc,int amt)
	{
		int newbal=acc.getBalance()-amt;
		acc.setBalance(newbal);
		System.out.println("Balance updated");
		
	}
	
	

}
