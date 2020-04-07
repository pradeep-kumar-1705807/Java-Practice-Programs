 class B
{
    int j=7;
	B(int i)
	{
		//System.out.println("Constructor of class B "+i);
	}
	void fun1()
	{
		System.out.println("fun1 A and Value of j:- "+j);
	}
	B returnObject()
	{
		return this;
	}

}
class A extends B
{
	 int j=99;
	A()
	{
		super(3);
		B b1=super.returnObject();
		
	
		System.out.println("Constructor of class A "+j);
		b1.fun1();
	
	}
	void fun1()
	{
		System.out.println("fun1 A");
	}
	public static void main(String args[])
	{
		A a1=new A();

	}
}