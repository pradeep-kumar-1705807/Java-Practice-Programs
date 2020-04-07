// Static nested class 
class F
{
	int x=15;
	static int n=10;
	void instance()
	{
		System.out.println("instance Function outer class");
	}
	static void staticFunction()
	{
		System.out.println("static Function outer class");
	}
	F()
	{
		System.out.println("Outer ");
	}
	static class E
	{
		int y=12;
		static int z=11;
		void fun1()
		{
			//instance();
			System.out.println("instance Function static inner class ::");
			System.out.println(n);
			
		}
		static void fun2()
		{
		     //instance();
			System.out.println("static  Function static inner class"+n);
			
		}
		
	}
}
class SExample
{
	public static void main(String args[])
	{
		F obj=new F();
		System.out.println(obj.n);
		
	}
	
}