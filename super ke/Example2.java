class A
{
	public void add()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public double add(int a)
	{
		double d=10.0;
		System.out.println("Return ");
		return d;
	}
}
class Example2
{
	public static void main(String args[])
	{
		double f;
		B b=new B();
	    b.add();
	
	}
}