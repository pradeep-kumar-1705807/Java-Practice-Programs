public class CustomThread extends Thread
{
	String str;
	CustomThread(String name)
	{
	  super(name);
	  str=name;
      start();
	  
	}
	public void run()
	{
		try
		{
			for(int l=0;l<20;l++)
			{
				System.out.println(Thread.currentThread().getName()+"----thread here");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException i)
		{
			System.out.println(str+"Thread Ends Here...." );
		}
	}
}
			