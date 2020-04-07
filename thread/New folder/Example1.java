class CallMe
{
	void say(int i)
	{
	    System.out.println(""+i);
	}
	 void call(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	String msg ;
	CallMe target;
	Thread t;
public Caller(CallMe targ,String str)
	{
		target=targ;
		msg=str;
		t=new Thread(this);
	}
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}
public class Example1
{
	public  static void main(String args[])
	{
		CallMe target=new CallMe();
		Caller obj1=new Caller(target,"Hello");
		Caller obj2=new Caller(target,"Synchronised");
		Caller obj3=new Caller(target,"World");
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();
		
	}
}