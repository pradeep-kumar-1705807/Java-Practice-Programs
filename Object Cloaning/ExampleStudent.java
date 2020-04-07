public class ExampleStudent implements Cloneable
{
	private int roll;
	private String name;
	
	ExampleStudent(int r ,String s)
	{
		roll=r;
		name=s;
		System.out.println("Constructor called");
	}
	ExampleStudent()
	{
		System.out.println("Default constuctor called");
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String args[])
	{
		try
		{
			ExampleStudent s1 =new ExampleStudent(107,"Pradeep Kumar");
		    ExampleStudent s2=(ExampleStudent)s1.clone();
		    System.out.println("Name :- "+s1.name+"\nRoll :- "+s1.roll);
		    System.out.println("Name :- "+s2.name+"\nRoll :- "+s2.roll);
		}
		catch(CloneNotSupportedException e)
		{
			
		}
	}
}
	