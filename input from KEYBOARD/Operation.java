import java.util.*;
public class  Operation
{
private int a;
private int b;
public void add(int x ,int y)
{
	int sum=x+y;
	System.out.println("Sum :- "+sum);
}

public void subtract(int x ,int y)
{
	int sub=x+y;
	System.out.println("Diff :- "+sub);
}
public void multiply(int x ,int y)
{
	int product=x*y;
	System.out.println("Product :- "+product);
}
public void divide(int x ,int y)
{
	int divide=x/y;

	System.out.println("Quotient :- "+divide);
}

public void greatest(int x,int y)
{
	int c=a>b?a:b;
	System.out.println("Greatest :- "+c);
}
public void  inputData()
{
	System.out.println("Enter Two Number :- ");
	Scanner cin=new Scanner(System.in);
	a=cin.nextInt();
	b=cin.nextInt();
}
public int getFirst()
{
	return a;
}
public int getSecond()
{
	return b;
}
public static void main(String args[])
{
	int choice;
	int ch=0;
	obj.inputData();
	Scanner cin=new Scanner(System.in);
Operation obj=new Operation();

System.out.println("******************************************************************");
System.out.println("**       1. ADD                                                 **");
System.out.println("**       2. subtract                                            **");
System.out.println("**       3. MULTIPLY                                            **");
System.out.println("**       4. DIVIDE                                              **");
System.out.println("**       5. FIND GREATEST OF THE TWO                            **");
System.out.println("******************************************************************");
do
{
obj.inputData();
System.out.println("Enter your choice in number :- ");
choice=cin.nextInt();


switch(choice)
{
	case 1 : obj.add(obj.getFirst(),obj.getSecond());
		      break;
    case 2 :  obj.subtract(obj.getFirst(),obj.getSecond());
		      break;
    case 3 :   obj.multiply(obj.getFirst(),obj.getSecond());
		      break;
    case 4 :   obj.divide(obj.getFirst(),obj.getSecond());
		      break;
    case 5 :    obj.greatest(obj.getFirst(),obj.getSecond());
		      break;
    default : System.out.println(" INVALID INPUT ");
}
System.out.println(" Wnat to continue press 0 else press 1 ");
ch=cin.nextInt();
}
while(ch==0);

}
}