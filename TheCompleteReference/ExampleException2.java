class ExampleException2
{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside Throw Before");
		throw new IllegalAccessException("demo");
		System.out.println("Inside Throw After");
		
	}
	static void throwTwo()throws IllegalAccessException
	{
		throwOne();
	}
	public static void main(String args[])throws IllegalAccessException 
	{
		try
		{
		
		throwTwo();
		}
		
		
		finally
		{
			System.out.println("Final Statements");
		}
		
		
		
	
	}
}