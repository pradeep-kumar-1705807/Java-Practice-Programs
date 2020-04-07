class A
{
	Integer x=new Integer(10);
}
public class Fibo extends A
{
	Integer x=new Integer(20);
	public static void main(String args[])
	{

		A a1=new Fibo();
		System.out.println(a1.x);

	}
}