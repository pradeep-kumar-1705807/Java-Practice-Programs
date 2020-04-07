 class A
{
	public void fun1(int x)
	{
		System.out.println("CLASS A");
		
	}
}
class B
{
	public void fun1(int x ,int y)
	{
		System.out.println("CLASS B");
		
	}
}
public class Example 
{
	public static void main(STring args)
	{
		B obj=new B();
		obj.fun1(5);
		obj.fun1(3,4);
	}
}