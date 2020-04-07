public class TestPriority implements Runnable
{
	String name;
	TestPriority(String s)
	{
		name=s;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println(name);
		}
		
	}
	public static void main(String args[])
	{
		Thread t1=new Thread(new TestPriority("PRADEEP"));
		Thread t2=new Thread(new TestPriority("ADITYA"));
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}