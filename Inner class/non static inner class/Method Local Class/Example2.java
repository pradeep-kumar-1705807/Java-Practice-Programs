public class Example2
{
	public void myMethod()
	{
		 int num=23;
		class InsideMethod
		{
			
			public  void print()
			{
				System.out.println("Value of num is "+ num);
			}

		}

		//MethodLocal m1=new MethodLocal();
		//m1.print();

	}
	public static void main(String args[])
	{
		Example2 e1=new Example2();
		m1.print();
		e1.myMethod();
	}
}