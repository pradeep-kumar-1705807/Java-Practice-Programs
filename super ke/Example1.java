class Fruit
{
	
	protected Fruit()
	{
		System.out.println("Fruit Class");
	}
}
class Apple extends Fruit
{

	 Apple()
	{
		super();
		System.out.println("Apple Class");
	}
}
class Example1
{
	public static void main(String args[])
	{
	  Apple a1=new Apple();
	}
}