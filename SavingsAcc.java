
public class SavingsAcc extends BankAccount {
	double interest=0.05;
	double maximumwithdraw;
	
	public SavingsAcc(String membername, double accountbalance,double maximumwithdraw) {
		super(membername, accountbalance, 2000);
		this.maximumwithdraw = maximumwithdraw;
	}
	
	public double getNetBalance() {
		double netbalance=accountbalance;
		netbalance=netbalance+(netbalance*interest);
		return netbalance;
		
	}
	
	
	@Override
	public void withdraw(double amt) {

		   if ((accountbalance-amt) >= minimumbalance && amt<maximumwithdraw) {
				
				accountbalance-=amt;
			}
			else 
				System.out.println("Exceeding limit ! ");
			//accountbalance-=amt;

		}

	@Override
	public String toString() {
		return "SavingsAcc [interest=" + interest + ", maximumwithdraw=" + maximumwithdraw + ", membername="
				+ membername + ", accountnumber=" + accountnumber + ", accountbalance=" + accountbalance
				+ ", minimumbalance=" + minimumbalance + "]";
	}
	
	
}
