public class ThrowExample
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Vaid to vote ");
			
		}
		else 
			System.out.println("Welcome to vote ");
	}
	public static void main(String args[])
	{
		try
		{
			validate(11);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the Code");

	}
}