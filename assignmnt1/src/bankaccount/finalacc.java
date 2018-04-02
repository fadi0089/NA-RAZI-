package bankaccount;
import java.util.Scanner;
public class finalacc {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		createaccount create=new createaccount(); 
		create.setaccount("Allied", "Current");
		System.out.println("Bank name is: "+create.getbankname()+" Account title: "+create.gettitle());
		create.opendate();
		System.out.println("Enter 1 for gold and 2 for silver and 3 for termination");
		int choice;
		choice=sc.nextInt();
		if(choice==1)
		{
			goldaccount gold=new goldaccount(create);
		}
		else if(choice==2)
		{
			silveraccount silver=new silveraccount(create);
		}
		else if(choice==3)
		{
			System.out.println("Program terminated");
			System.exit(0);
		}
	}
//fafsa
}
