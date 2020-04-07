public class Outer
{
    private	class Inner extends Outer
	{
		public void fun1()
		{
			System.out.println("This non static Inner class ");
		}
	}
	public static void main(String args[])
	{
		Outer o1=new Outer();
		Outer.Inner i1=o1.new Inner();
		i1.fun1();
	}
}