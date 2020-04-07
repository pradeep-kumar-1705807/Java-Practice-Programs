class A
{
	private int x=13;
	static int z=10;
	A()
	{
		System.out.println("class A");
		//System.out.println(B.y);
	}
	class B
	{
		B()
		{
			System.out.println("class B");
		}
		public int y=10;
		void fun1()
		{
			System.out.println(z);
		}
	}
}
class Example10
{
	public static void main(String args[])
	{
		A obj1=new A();
		A.B obj2=obj1.new B();
		obj2.fun1();
		
		//A.B obj2=obj.new B();
		//System.out.println(obj2.y);
		
	}
}