package Tushar;
class A
{
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
		fun1();

	}
}