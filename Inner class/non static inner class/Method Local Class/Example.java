
public class Example
{
	public void myMethod()
	{
		 int num=23;
		class MethodLocal
		{
			
			public  void print()
			{
				System.out.println("Value of num is "+ num);
			}

		}

		MethodLocal m1=new MethodLocal();
		m1.print();

	}
	public static void main(String args[])
	{
		Example e1=new Example();
		Example$1MethodLocal m1=new Example$1MethodLocal();
		m1.print();
		e1.myMethod();
	}
}