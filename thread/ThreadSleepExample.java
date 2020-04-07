class NewThread1 implements Runnable
{
	String t_name;
	Thread th;
	NewThread(String str)
	{
		T_name=str;
		t=new Thread(this,t_name);
		System.out.println("New Thread :- "+t);
		t.start();
		
	}
	public void run()
	{
		try
		{
			for(int i=75;j>50;j--)
			{
				System.out.println(t_name+" : "+j);
		}
		catch(InterruptedException e)
		{
			System.out.println("Breaking Up");
		}
		System.out.println("Finishing up");
	}
}