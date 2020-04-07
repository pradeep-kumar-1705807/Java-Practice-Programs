public class ThreadJoinExample1 extends Thread
{
	String str;
	ThreadJoinExample1(String s)
	{
		str=s;
		this.start();
	}
	public void run()
	{ try
		{
			for(int i=0;i<10;i++)
		    {
			   System.out.println("Thread :"+str+" is running");
			   Thread.sleep(1000);
		    }
		}
		catch(InterruptedException e)
		{
			System.out.println("hello World ");
		}
	}
	
	public static void main(String args[])
	{
		ThreadJoinExample1 t1=new ThreadJoinExample1("one");
		ThreadJoinExample1 t2=new ThreadJoinExample1("two");
		ThreadJoinExample1 t3=new ThreadJoinExample1("three");
		try
		{
			  System.out.println(t1.isAlive());
			t1.join();
		    System.out.println(t1.isAlive());
		    t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("hello World 2");
		}
	
		
    }
}