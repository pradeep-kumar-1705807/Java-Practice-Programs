 class A
{
	public static void fun1(int x)
	{
		System.out.println("CLASS A");
		
	}
}
class B extends A
{
	public static void fun1(int y)
	{
		System.out.println("CLASS B");
		
	}
}
public class Example 
{
	public static void main(String []args)
	{
		B obj=new B();
		obj.fun1(5);
		obj.fun1(3);
	}
}