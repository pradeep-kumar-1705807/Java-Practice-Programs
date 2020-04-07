interface Salary
{
	int basic=1000;
	void fun1();
	void fun2();
	void fun3();
	
}
 abstract class Manager implements Salary
{
	public void fun1()
	{
		System.out.println("Function 1");
		
	}
	public void fun2()
	{
		System.out.println("Function 2");
	}
}
class Department extends Manager
{
	public  void fun3()
	{
		System.out.println("Function 3");
	}
	
}
class Example3
{
	public static void main(String args[])
	{
		Department d1=new Department();
		d1.fun1();
		d1.fun2();
		d1.fun3();
	}
}
	