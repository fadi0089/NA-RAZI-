package bankaccount;

import java.util.Scanner;

public class silveraccount implements banktransaction {
	long deposit,totlblnc=1000,newblnc,transaction;
	Scanner s=new Scanner(System.in);
	void decision()
	{   int choice;
		System.out.println("Enter 1 for deposit and 2 for withdrawl and 3 to terminate");
		choice=s.nextInt();
		if(choice==1)
		{
			deposit();
		}
		else if(choice==2)
		{
			withdraw();
		}
		else if(choice==3)
		{
			System.out.println("Program terminated");
			System.exit(0);
		}
		else
		{
			System.out.println("Enter the correct number");
			decision();
		}
	}
	 silveraccount(createaccount create)
	{
			decision();
		
	}
	public void deposit()
	{
		System.out.println("Enter the amount u want to deposit");
		deposit=s.nextInt();
		newblnc=deposit+totlblnc;
		totlblnc=newblnc;
		System.out.println("Your new balance after deposit is:PKR"+newblnc);
		decision();
	}
	public void withdraw()
	{
		System.out.println("Enter amount for transaction");
		transaction=s.nextInt();
		if(transaction>totlblnc+50000)
		{
			System.out.println("Sorry your ammount is not enough");
		}
		else
		{
			newblnc=totlblnc-transaction;
			totlblnc=newblnc;
			System.out.println("Your transaction amount is "+transaction+"\n and ur new balance is :PKR"+newblnc);
		}
		decision();
		}
	
	
	

}
