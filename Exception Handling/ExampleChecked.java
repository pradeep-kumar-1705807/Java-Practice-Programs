import java.io.*;
public class ExampleChecked
{
	public void m() throws IOException
	{
		throw new IOException("Error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
	
   public static void  main(String args[])
   {
	   ExampleChecked e1= new ExampleChecked();
	   e1.p();
   }
}
