public class NestedExceptionExample
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=80/0;
			
			}
			catch(ArithmeticException e)
			{
				System.out.println("Nested Block one");
				
			}
			try
			{
				int b[]=new int[5];
				b[10]=9;
				
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Out of bound exception");
			}
			System.out.println("Rest of the codes ");
		}
		catch(Exception e)
		{
			System.out.println("Outer Try - catch Blocks Occurs");
		}
		System.out.println("Normal Flow of Program ");
    }
}	