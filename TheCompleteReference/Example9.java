abstract  class Person
{
	abstract public void show();
	public void sayHi()
	{
		System.out.println("Abhi Hi");
	}
	
}
class Example9 extends Person
{
	public void sayBye()
	{
		System.out.println("Abhi Bye");
	}
	public  void show()
	{
		System.out.println("Abhi Hila");
	}
	public static void main(String agrs[])
	{
	   Person p1=new Example9();
		p1.show();
		p1.sayHi();
		p1.sayBye();
		
	}
}