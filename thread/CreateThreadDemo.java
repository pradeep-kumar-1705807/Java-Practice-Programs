class CreateThreadDemo
{
	public static void main(String args[])
	{
		new  NewThread();
		try
		{
			for(int i=10;i>6;i--)
			{
				System.out.println("Parent Thread :"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
				System.out.println("Parent Interruption Thread");
				System.out.println("Exiting Parent ");
				
		}
	}
}
class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Creating Child  Thread");
		System.out.println("Thread of Child");
		t.start();
	}
	public void run()
	{
		try
		{
			for(int k=10;k>6;k--)
			{
				System.out.println("Child Thraed :"+k);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interruption :-");
			System.out.println("Exiting Child Thread");
		}
	}
}