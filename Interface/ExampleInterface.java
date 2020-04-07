
interface Interface1
{
	public void fun1();
	static void show();
	default void display()
	{
		System.out.println("Pradeep");
	}

}
class ExampleInterface implements Interface1
{
	public void fun1()
	{
		System.out.println("Fun1");
	}
	public static void show()
	{
		System.out.println("Hierrf");
	}
	public static void main(String arg[])
	{
		ExampleInterface f1=new ExampleInterface();
		f1.display();
		ExampleInterface.show();
	}
}
