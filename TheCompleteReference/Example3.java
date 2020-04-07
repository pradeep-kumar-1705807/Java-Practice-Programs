public class Example3
{
	public static void  main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
		A r;
		r=a;
		r.show();
		r=b;
		r.show();
		r=c;
		r.show();
	}
}
class A
{
	public void show()
	{
		 System.out.println("class A");
	}
}
class B extends A
{
	public void show()
	{
		 System.out.println("class B");
	}
}
class C extends B
{
	public void show()
	{
		 System.out.println("class C");
	}
}