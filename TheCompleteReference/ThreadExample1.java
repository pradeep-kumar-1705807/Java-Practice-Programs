class ThreadSample1 implements Runnable
{
	String str;
	ThreadSample1(String str)
	{
		this.str=str;
	}
	public void run()
	{
		try
		{
		for(int i=0;i<10;i++)
		{
			System.out.println(str+" :-"+i);
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Fuck off");
		}
		
	}
}
class ThreadExample1
{
	public static void main(String args[])throws InterruptedException
	{
		Thread t1=new Thread(new ThreadSample1("First "));
		Thread t2=new Thread(new ThreadSample1("Second "));
		Thread t3=new Thread(new ThreadSample1("Third "));
		t3.join();
		t1.start();
	//	t3.join();
		t2.start();
		t3.start();
	
	}
}	