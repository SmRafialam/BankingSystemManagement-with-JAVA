import java.util.*;
public class TestBankSystem {
	public static void main(String[] args)
	{
		BankAccount ba=null;
		
	
//		SavingsAcc saaccount=null;
//		CurrentAcc cuaccount=null;
//		StudentAcc staccount=null; 
		System.out.println("What kind of Bank account you wnt to open ?");
		System.out.println("1.Savings Account\n2.Current Account\n3.Student Account\n");
		System.out.println("please select your option : ");
		int choi;
		String cho;
		Scanner src=new Scanner(System.in);
		choi=src.nextInt();
		if(choi==1) 
		{
			System.out.println("Enter your name :");
			String name = src.next();
			System.out.println("Enter initial balance :");
			double balance=src.nextDouble();
			System.out.println("Enter maximum withdraw limit :");
			double withdraw=src.nextDouble();
			ba = new SavingsAcc(name,balance,withdraw);
	    }
		
		else if (choi==2)
		{
			System.out.println("Enter your name :");
			String name = src.next();
			System.out.println("Enter initial balance :");
			double balance=src.nextDouble();
			System.out.println("Enter trade license :");
			String trade=src.next();
			ba = new CurrentAcc(name,balance,trade);
		}
		
		else if (choi==3)
		{
			System.out.println("Enter your name :");
			String name = src.next();
			System.out.println("Enter initial balance :");
			double balance=src.nextDouble();
			System.out.println("Enter Institution :");
			String institution=src.next();
			ba = new StudentAcc(name,balance,institution);
		}
		
		
		while(true)
		{
			System.out.println("1.Deposit\n2.Withdraw\n3.Show balance\n4.Show data\n5.Exit\nPlease enter your choice");
			cho=src.next();
			if(cho.equals("1"))
			{
				System.out.println("Enter the amount to deposit: ");
				double amount=src.nextDouble();
//				if(choi==1)
//					saaccobant.deposit(amount);
//				else if (choi==2)
//					cuaccount.deposit(amount);
//				else if (choi==3)
//					staccount.deposit(amount);
//			
				ba.deposit(amount);
			}
			
			else if (cho.equals("2"))
			{
				System.out.println("Enter the amount to withdraw : ");
				double amnt=src.nextDouble();
//				if(choi==1)
//					saaccount.withdraw(amnt);
//				else if (choi==2)
//					cuaccount.withdraw(amnt);
//				else if (choi==3)
//					staccount.withdraw(amnt);
				ba.withdraw(amnt);
			}
			
			else if (cho.equals("3"))
			{
//				if(choi==1)
//					System.out.println(saaccount.getbalance());
//				else if (choi==2)
//					System.out.println(cuaccount.getbalance());
//				else if (choi==3)
//					System.out.println(staccount.getbalance());
				ba.getbalance();
			}
			
			else if (cho.equals("4"))
			{
//				if(choi==1)
//					System.out.println(saaccount);
//				else if (choi==2)
//					System.out.println(cuaccount);
//				else if (choi==3)
//					System.out.println(staccount);
				System.out.println(ba);
			}
			else if (cho.equals("5"))
					break;
			else 
				System.out.println("Invalid input ! ");
		}
		
	}

}
