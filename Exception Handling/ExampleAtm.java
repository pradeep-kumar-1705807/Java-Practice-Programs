import java.util.*;
public class ExampleAtm
{
public static void main(String args[])
{
  int balance=5000;
  int withdraw=500;
  try{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Amount to withdraw :- ");
  withdraw=sc.nextInt();
 
	   if(withdraw>balance)
		   throw new ArithmeticException("Insufficient Balance");
	   balance=balance-withdraw;
	   System.out.println(" Transction Sucessfull ");
	   System.out.println("Available Balance :- "+balance);
  }
  catch(ArithmeticException e)
  {
	  System.out.println(e.getMessage());
  }
}
}