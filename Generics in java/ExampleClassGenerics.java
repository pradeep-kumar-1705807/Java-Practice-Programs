class Example<T1,T2>
{
   public 	T1 obj1;
   public	T2 obj2;
   Example(T1 p,T2 q)
   {
	   obj1=p;
	   obj2=q;
	   System.out.println(obj1);
	   System.out.println(obj2);
   }
   
   
}
public class ExampleClassGenerics
{
	public static void main(String args[])
	{
	Example e1=new Example(2,4);
	Example e2=new Example("Hello ","World");
	
	}
	
}