package BackActivety;

public class TestTranscation extends Trasction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc =new Account();
		acc.setAccname("pinki");
		acc.setEmail("pinki@124");
		acc.setBalance(5000);
		
		Trasction tcs =new Trasction();
		tcs.deposite(acc, 3000);
		System.out.println(acc);
		tcs.withdraw(acc, 1000);
		System.out.println(acc);
		

	}

}
