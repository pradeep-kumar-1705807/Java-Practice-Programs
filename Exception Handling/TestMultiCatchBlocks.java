class TestMultiCatchBlocks
{
	public static  void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/3;
		}
		catch(ArithmeticException e)
		{
			System.out.println("task 1");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task 2");
		}
		catch(Exception e)
		{
			System.out.println("Common Task is completed ");
		}
		
		System.out.println("Rest of the code to be executed ");
	}
}