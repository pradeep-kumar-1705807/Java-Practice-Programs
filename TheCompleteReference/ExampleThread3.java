class ExampleThread3
{
	static void fun1()throws InterruptedException
	{
		throw new  InterruptedException();
	}
	public static void main(String args[])throws InterruptedException
	{
		fun1();
	}
}