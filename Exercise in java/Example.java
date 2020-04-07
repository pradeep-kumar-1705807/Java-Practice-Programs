interface Example
{
	private void fun2()
	{
		System.out.println("Staic Fun1");
	}
	
	static void fun1()
	{
		System.out.println("Staic Fun1");
	}
	static void main(String args[])
	{
		System.out.println("Hello World");
		fun1();
	}
}