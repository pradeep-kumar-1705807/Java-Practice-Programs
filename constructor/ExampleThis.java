class MyClass
{
	private int a;
	private int b;
	MyClass(int i,int j)
	{
		a=i;
		b=j;
		System.out.println(a+" "+b);
	}
	MyClass()
	{
		this(0,0);
	}
	MyClass(int i)
	{
		this(i,i);
		
	}
	

}
public class ExampleThis
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass(2,3);
		MyClass m2=new MyClass();
		
		
	}
}