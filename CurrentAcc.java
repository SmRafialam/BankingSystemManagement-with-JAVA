
public class CurrentAcc extends BankAccount {
	String tradeLicense;
	public CurrentAcc(String membername,double accountbalance,String tradeLicense)
	{
		super(membername,accountbalance,5000);
		this.tradeLicense=tradeLicense;
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [tradeLicense=" + tradeLicense + ", membername=" + membername + ", accountnumber="
				+ accountnumber + ", accountbalance=" + accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}

	
}
