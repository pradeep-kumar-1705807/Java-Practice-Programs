class A
{
	public void fun1()
	{
		System.out.println("class A fun1");
	}
	public void fun2()
	{
System.out.println("Fuck off");
	}

}
class B extends A
{
	
	public void fun1()
	{
		super.fun1();
		super.fun2();
		System.out.println("class B fun1");

	}

}
public class Example
{
	public static void main(String args[])
	{
		B obj= new B();
		obj.fun1();
		obj.fun2();

	}
} 