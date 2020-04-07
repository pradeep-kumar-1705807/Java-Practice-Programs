public class Outer
{
	static public class Inner
	{
		public void fun1()
		{
			System.out.println("fun1 is of the inner class ");
			
		}
	}
	public static void main(String args[])
	{
		Outer.Inner i1=new Outer.Inner();
		i1.fun1();
		
	}
}
