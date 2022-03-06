
public class StudentAcc extends SavingsAcc {
	String institution;
	//double minimumbalance=100;
	
	public StudentAcc(String membername, double accountbalance,String institution) {
		super(membername, accountbalance, 20000);
		this.institution=institution;
		minimumbalance=100;
	}

	
	@Override
	public String toString() {
		return "StudentAcc [institution=" + institution + ", interest=" + interest + ", maximumwithdraw="
				+ maximumwithdraw + ", membername=" + membername + ", accountnumber=" + accountnumber
				+ ", accountbalance=" + accountbalance + ", minimumbalance=" + minimumbalance + "]";
	}

//	double maxLimit()
//	{
//		return maximumwithdraw;
//	}
	
	
}
