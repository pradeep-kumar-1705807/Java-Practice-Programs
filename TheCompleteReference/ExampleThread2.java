class Q
{
	int n;
	boolean valueset=false;
	synchronized int get ()
	{
		while(!valueset)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception");
				
			}
			System.out.println("Got :"+n);;
			valueset=false;
			notify();
		}
			return n;
		
	}
		synchronized void put (int n)
	{
		while(!valueset)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception");
				
			}
			this.n=n;
			valueset=true;
			System.out.println("Put :"+n);;
			notify();
			
		}
	}
}
class Producer  implements Runnable
{
	Q q;
	Thread t;
	Producer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Producers");
	}
	public void run()
	{
		int i=0;
		{
			while(true)
			{
				q.put(i++);
			}
		}
	}
}
class Consumers implements Runnable
{
	Q q;
	Thread t;
	Consumers(Q q)
	{
		this.q=q;
		t=new Thread(this,"Consumers");
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
class ExampleThread2
{
	public static void main(String args[])
	{
		Q q=new Q();
		Producer p=new Producer(q);
		Consumers c=new Consumers(q);
		p.t.start();
		c.t.start();
		//System.out.println("Press ctrl-c  to stop");
	}
}