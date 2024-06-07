package BackActivety;

public class Account implements  bank {
	private String Accname,Email;
	private int Balance;
	public String getAccname() {
		return Accname;
	}
	public void setAccname(String accname) {
		Accname = accname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Accname=" + Accname + ", Email=" + Email + ", Balance=" + Balance + "]";
	}

}
