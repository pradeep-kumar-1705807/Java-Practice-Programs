public class ExampleThrows
{
	public static void myMethod() throws ArithmeticException
	{
		int i=50/0;
      System.out.printf("%s","MY METHOD");
	}
	public static void main(String[] args)
	{
		try
		{
			myMethod();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled By Throws");
		}
	}
}