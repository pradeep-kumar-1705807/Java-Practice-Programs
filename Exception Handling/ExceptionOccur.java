public class ExceptionOccur
{
	public static void main(String[] args)
	{
	  try
	  {
		  int a[]=new int[5];
		  a[6]=7;
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println(e);
		  
	  }
	  finally
	  {
		  System.out.println("finally Block executes when Exception Occurs");
	  }
	}
}