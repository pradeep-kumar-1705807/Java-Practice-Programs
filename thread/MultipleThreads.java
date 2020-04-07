public class MultipleThreads
{
	public static void main(String args[])
	{
		CustomThread c1=new CustomThread("First");
		CustomThread c2=new CustomThread("Second");
		CustomThread c3=new CustomThread("Third");
		CustomThread c4=new CustomThread("Fourth");
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+"main thread .....");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException i)
		{
			System.out.println("main Thread gone");
			
		}
	}
}