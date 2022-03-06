import java.util.*;
public class BankAccount {
	String membername,accountnumber;
	double accountbalance,minimumbalance;
	
	public BankAccount(String membername,double accountbalance,double minbalance) {
		super();
		this.membername=membername;
		this.accountbalance=accountbalance;
		this.minimumbalance=minbalance;
		Random rand = new Random();
		accountnumber=""+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
		
	}
	
	
	
	public void deposit(double amt) {
		accountbalance+=amt;
		}
	public void withdraw(double amt) {

	   if (amt<=accountbalance) {
			
			accountbalance-=amt;
		}
		else 
			System.out.println("Exceeding limit ! ");
	}
	
	public double getbalance() {
		return accountbalance;
	}

	@Override
	public String toString() {
		return "BankAccount [membername=" + membername + ", accountnumber=" + accountnumber + ", accountbalance="
				+ accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}
	
	
}
