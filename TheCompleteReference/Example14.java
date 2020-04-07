class A
{
public	int i=10;
}
class B extends A
{
	
}
class C extends B
{
}
class Example14
{
	public static void main(String args[])
	{
		C c1=new C();
		System.out.println(c1.i);
	}
}