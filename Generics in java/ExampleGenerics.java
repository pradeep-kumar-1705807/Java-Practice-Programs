public class ExampleGenerics
{
  public  static <E> void add(E x,E y)
  {
      
       System.out.print(x);
       System.out.println(y);
  }
  public static void main(String arg[])
  {
   String s1="Hello ";
   String s2="World ";
   add(s1,s2);
   Integer i1=new Integer(10);
   Integer i2=new Integer(20);
   add(i1,i2);

  }
}