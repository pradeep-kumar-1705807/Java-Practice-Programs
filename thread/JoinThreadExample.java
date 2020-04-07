class ExampleJoin implements Runnable
{
  String str;
  Thread t;
  ExampleJoin(String s)
  {
     str=s;
     t=new Thread(this,str);
     t.start();

  }
  public void run()
  {
	  try
	  {
		  for(int i=5;i>=0;i--)
		  {
			  System.out.println("Child Thread ...."+i); 
          }
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println("ebding ----"+str);
		  
	  }
	  
   }
}
public class JoinThreadExample 
{
   public static void main(String args[])
   {
	   ExampleJoin e1=new ExampleJoin("one");
	   ExampleJoin e2=new ExampleJoin("two");
	   ExampleJoin e3=new ExampleJoin("three");
	   ExampleJoin e4=new ExampleJoin("four");
	   try
	   {
		   e1.t.join();
		   e2.t.join();
		   e3.t.join();
		   e4.t.join();
	   }
	   catch(InterruptedException e)
	   {
		   System.out.println("Main Thread Exception");
	   }
   }
}