import java.util.*;
abstract class BankAccount
{
	long accno;
	double bal;
	String cName,city;
	abstract void deposit();
	abstract void withdraw();

	public void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number: ");
		accno=sc.nextLong();
		System.out.println("Enter the Customer name: ");
		cName=sc.next();
		System.out.println("Enter the Account balance: ");
		bal=sc.nextDouble();
		System.out.println("Enter the Customer city: ");
		city=sc.next();
	}
	public void display()
	{
		System.out.println("Account No.\tCustomer Name\tAccount Balance\tCity");
		System.out.println("------------------------------------------------------------");
		System.out.println(accno+"\t"+cName+"\t"+bal+"\t"+city);
	}
}
class SavingsAccount extends BankAccount
{
	public void deposit()
	{
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		double dep=sc4.nextDouble();
		super.bal=super.bal+dep;
		System.out.println("New Account balance is: "+super.bal);
	}
	public void withdraw()
	{
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter the withdrawl amount: ");
		double amt=sc5.nextDouble();
		if(super.bal-amt<1000)
		{
			System.out.println("You Balance is less then 1000.");
		}
		else
		{
			super.bal=super.bal-amt;
		    System.out.println("New Account Balance is: "+super.bal);
		}
	}
	      
}
class CurrentAccount extends BankAccount
{
	public void deposit()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the deposit amount: ");
		double dep=sc1.nextDouble();
		super.bal=super.bal+dep;
		System.out.println("New Account balance is: "+super.bal);
	}
	public void withdraw()
	{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the withdrawl amount: ");
		double amt=sc2.nextDouble();
		if(super.bal-amt<1000)
		{
			System.out.println("You Balance is less then 1000.");
		}
		else
		{
			super.bal=super.bal-amt;
		    System.out.println("New Account Balance is: "+super.bal);
		}
	}
}
class Interest1 extends SavingsAccount
{
	void interest()
	{
		super.bal+=super.bal*0.04;
		System.out.println("Amount after interest is: "+super.bal);
	}
}
class Interest2 extends CurrentAccount
{
	void interest2()
	{
		Scanner sc7=new Scanner(System.in);
		System.out.println("Enter the no. of years: ");;
		int year1=sc7.nextInt();
		double int2=(super.bal*2*year1)/100;
		double res1=bal+int2;
		System.out.println("Amount after interest is: "+res1);
	}
}
class Banking
{
	public static void main(String[] args) {
		Interest1 i1=new Interest1();
		Interest2 i2=new Interest2();
		Scanner sc3=new Scanner(System.in);
		int n=1;
		while(n!=8)
		{
			System.out.println("1. Input Data");
			System.out.println("2. Display Data");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Interest of Savings");
			System.out.println("6. Interest of Current");
			System.out.println("7.Exit");
			System.out.println("Enter your choice: ");
			int ch=sc3.nextInt();
			switch(ch)
			{
			case 1:
				i1.inputData();
				break;
			case 2:
				i1.display();
				break;
			case 3:
				i1.deposit();
				break;
			case 4:
				i1.withdraw();
				break;
			case 5:
				i1.interest();
				i2.interest2();
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}