public class ExampleFinallyNoException
{
	public static void main(String args[])
	{
		try
		{
			int a=10/5;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally bloack Executes when Ni Exception occurs");
		}
		
	}
}	