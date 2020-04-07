public class PausingAThread
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Hello ");
			Thread.sleep(2000);
			System.out.println("from");
			Thread.sleep(3000);
			System.out.println("Java");
			Thread.sleep(6000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exiting Thread");
		}
	}
}