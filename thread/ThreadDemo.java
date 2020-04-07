class ChildThread extends Thread
{
 ChildThread()
 {
	 super("child");
	 start();
 }
 public void run()
 {
	 try
	 {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+"thread is here");
		     Thread.sleep(1000);
	     }
	 }
	 catch(InterruptedException i)
	 {
		 System.out.println("child Thread Ended");
	 }
 }
}
public class ThreadDemo
{
	public static void main(String args[])
	{
		ChildThread c1=new ChildThread();
		try
		{
			for(int l=0;l<10;l++)
			{
				System.out.println(Thread.currentThread().getName()+"thread here ...");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread gets Executed");
		}
			
	}
}
	 
