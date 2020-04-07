class TestJoinMethod implements Runnable
{
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
				System.out.println("Thread Existing");
			}
			System.out.println(i);
		}
		
	}
}
public class ExampleJoin
{
	public static void main(String args[])
	{
	   Thread t1=new Thread(new TestJoinMethod());
	   Thread t2=new Thread(new TestJoinMethod());
	   t1.run();
	   t2.run();
	   t1.start();
	   t2.start();
	   
	}
}
