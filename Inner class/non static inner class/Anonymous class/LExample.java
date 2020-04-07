class Pradeep
{
	
	void fun1()
	{
		class Algorithm{
			Algorithm()
			{
				System.out.println("Algo Construcor");
			}
			void fun2()
			{
				System.out.print("Local Inner Class");
			}
		}
		Algorithm a1=new Algorithm();
	    a1.fun2();
		
	}
	
}
class LExample
{
	public static void main(String args[])
	{
		Pradeep p1=new Pradeep();
		p1.fun1();
	}
}