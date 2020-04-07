public class Example1
{
	public static void main(String [] args)
	{
		try
		{
		System.out.println(Integer.valueOf("abc"));
		}
		catch(NumberFormatException e)
		{
			System.out.printf("%s","String arguement in value of");
		}
	}
}