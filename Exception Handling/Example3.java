class Example3
{
	public static void main(String args[])
	{
		try
		{
			int z=50/0;
		    
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("My First Exception");
		
	}
}