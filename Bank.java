import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		do {
			// show menu
			showMenu();
			option = scan.nextInt();
			switch(option) {
				case 1: // create account
					System.out.println("Please enter name, id and balance");
					String name = scan.next();
					String id = scan.next();
					double balace = scan.nextDouble();
					BankAccount ba = new BankAccount(name, id, balace);
					accounts.add(ba);
					break;
				case 2: // deposit
					System.out.println("Please enter the account number:");
					String accNum= scan.next();
					System.out.println("How much you want to deposit:");
					double amt = scan.nextDouble();
					for(int i=0; i<accounts.size(); i++) {
						BankAccount b1 = accounts.get(i);
						String tempId = b1.getId();
						if(tempId.equals(accNum))
							b1.deposit(amt);
					}
					break;
				case 3: // withdraw
					break;
				case 4: // display
					for(BankAccount b: accounts)
						System.out.println(b);
					break;
				default:
					break;
			}
		}while(option != 0);
		
		// switch case for different option
	}
	
	public static void showMenu() {
		// 1. to create account
		// 2. to deposit
		// 3. to withdraw
		// 4. to display
		// 0. to quit
		System.out.println("Please enter");
		System.out.println("1 to create new account");
		System.out.println("2 to depost money");
		System.out.println("3 to withdraw");
		System.out.println("4 to display");
		System.out.println("0 to quit");
		
	}

}
