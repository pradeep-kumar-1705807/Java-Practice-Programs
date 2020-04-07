interface i1
{
	public void fun1();

}
interface i2 extends i1
{

	public void fun2();

}
interface i3 extends i2
{
	public int a=19;


	public void fun3();
}
class A implements i3
{


	public void fun1()
	{
		System.out.println("fun1()"+a);
	}
	public void fun2()
	{
		System.out.println("fun2()");
	}
	public void fun3()
	{
		System.out.println("fun3()");
	}
	public void fun4()
	{System.out.println("fun4()");
	}
}
public class Example
{
	public static void main(String []args)
	{
		i3 ref1=new A();
		A ref=new A();
		ref1.fun1();
		//ref1.fun4();
		ref1.fun2();
		System.out.println("static variable of interface i3 is :-"+A.a);
	}
}
