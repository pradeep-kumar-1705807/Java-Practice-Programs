import java.util.*;
class Account
{
private int bal;
public Account(int bal)
{
	this.bal=bal;
}
public boolean isSufficientBalance(int w)
{
if(this.bal>w)
	return true;
else 
	return false;
}
public void withdraw(int amt)
{
	bal=bal-amt;
	System.out.println("Withdraw money is :- "+amt);
	System.out.println("Your current balance :- "+bal);
}
}
class Customer implements Runnable

{
	private String name;
	private Account a1;
	public Customer(Account a1,String name)
	{
		this.name=name;
		this.a1=a1;
	}
	public void run()
	{
		Scanner cin=new Scanner(System.in);
	
		synchronized(a1)
		{
			System.out.println(name+"Enter Amount to Withdraw :");
		    int amt=cin.nextInt();
	    	if(a1.isSufficientBalance(amt))
		     { 
			  System.out.println(name);
			   a1.withdraw( amt);
		
		     }
		else 
			System.out.println("Insufficient Balance");
         
         
        }
    }
}
public class ThreadExample
{
public static void main(String args[])
{
	Account a2=new Account(1000);
	Customer c1=new Customer(a2,"Pradeep");
	Customer c2=new Customer(a2,"Aditya");

	Thread t1=new Thread(c1);
	Thread t2=new Thread(c2);
	t1.start();
	t2.start();

}
}