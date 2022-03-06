import java.util.*;

public class Account {
	
public static void main(String[] args) {
	System.out.println("Create your account !");
	System.out.println("Enter name : ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	System.out.println("Enter id : ");
	String id = sc.next();
	System.out.println("Enter amount : ");
	double amount = sc.nextDouble();
	
	Bankacc account = new Bankacc(name,id,amount);
	
	
	
	while(true) {
		System.out.printf("1.Deposit\n2.Withdraw\n3.Show balance\n4.Show statement\n0.Exit");
		System.out.println("\nPlease enter your choise : ");
		String i = sc.next();
		if(i.equals("1")) {
			System.out.println("Enter money to deposit : ");
			double money = sc.nextDouble();
			account.deposit(money);
			}
		
		else if(i.equals("2")) {
			System.out.println("Enter money to withdraw : ");
			double  money = sc.nextDouble();
			account.withdraw(money);
			}
		else if(i.equals("3")) {
			System.out.println("Your current balance is : "+account.getBalance());
			//account.display();
		}
		else if(i.equals("0")) {
			break;
		}
		else if(i.equals("4")) {
			System.out.println(account);
		}
		else {
			System.out.println("Invalid input !");
		}
				
	  }


}	
}
	

