class ExamplePropagation
{
	public void m()
	{
		int d=50/0;
		
	}
	public  void n()
	{ 
	   try
	   {
		this.m();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception Handled in n");
		   
	   }
	}
	public void p()
	{
		try
		{
			this.n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled in p");
		}
	}
	public static void main(String args[])
	{
		ExamplePropagation obj=new ExamplePropagation();
		obj.p();
		System.out.println("Normal Flow");
	}
}