 class Table
{
	public void printTable(int n)
	{
		for(int i=1;i<=5 ;i++)
		System.out.println(n*i);
	}
}
class MyThread1 extends Thread
{
	Table t;
	 MyThead1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(3);
	}
}
 class MyThread2 extends Thread
{
	Table t;
	MyThead2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}

public class ExampleSynchronise
{
	
	public static void main(String args[])
	{
		Table obj=new Table();
		MyThead1 m1=new MyThead1(obj);
		MyThead2 m2=new MyThead2(obj);
		m1.start();
		m2.start();
		
	}
}