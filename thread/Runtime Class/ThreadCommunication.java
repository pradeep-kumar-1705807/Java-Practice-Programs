import java.util.*;
class Q
{
	int num;
	boolean valueSet=false;
	public synchronized void  put(int num)
	{
		while(valueSet)
		{
			try
			{
				wait(); 
			}
			catch(Exception e)
			{

			}
		}
		this.num=num;
		System.out.println("Put : "+num);
		valueSet=true;
		notify();

	}
	public synchronized void get()
	{
		while(!valueSet)
		{
			try{
			wait();
		}
		catch(Exception e){}
		}
		valueSet=false;
		System.out.println("Get : "+num);
		notify();
	}

}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Producer");
		t.start(); 
	} 
	public void run()
	{
		String s=new String();
		int i=0;
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			//i=sc.nextInt();
			i++;

			try
			{
				Thread.sleep(1000);

			}
			catch(Exception e)
			{

			}
		}
	}
}
class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumers");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try
			{
			Thread.sleep(1000);
		    }
		    catch(Exception e)
		    {

		    }

		}
	}
}
public class ThreadCommunication
{
	public static void main(String args[])
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q); 
	}
}