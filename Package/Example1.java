package Tushar.com.hello;
class A
{
	public int a=0;
	A()
		{
			System.out.println("constructor of A");
		}


}
class B extends A
{
	B()
		{
			System.out.println("constructor of B");
		}


}
class C extends B
{
	C()
		{
			System.out.println("constructor of C");
		}
	static{
	 	System.out.println("staic Block");
	}

}
class Example1
{
	public static void fun1()
	{
		System.out.println("Abhishek hi");
	}
	
	public static void main(String args[])
	{
		A a1=new A();
		a1.i=4;
		fun1();

	}
}