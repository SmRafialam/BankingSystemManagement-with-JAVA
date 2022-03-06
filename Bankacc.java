
public class Bankacc {
	String name;
	String id;
	double balance;
	static String BNK="Dutch";
	
	public Bankacc(String n,String i, double b) { //constructor.
		name=n;
		id=i;
		balance =b;
		
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void deposit(double amt) {
		this.balance = balance +amt;
		
	}
	
    public void withdraw(double amt) {
    	if(amt>balance) {
    		System.out.println("Invlaid input !");
    	     }
    	else
    		balance = balance-amt;
    	}
    
    public double getBalance() {
    	return balance;
    }

   

	@Override
	public String toString() {
		return " [name=" + name + ", id=" + id + ", balance=  " + balance + ",  Bank = "+BNK +"]";
	}

	
	

	
}
