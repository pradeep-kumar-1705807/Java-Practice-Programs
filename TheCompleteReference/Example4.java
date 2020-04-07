public class Example4
{
  public static void main(String args[])
  {
    AbstractDemo ab1;
    ab1=new AbstractDemo1();
    ab1.follow();
    System.out.println(ab1);

  }
}

abstract class AbstractDemo
{
 abstract protected void follow();
}
class AbstractDemo1 extends AbstractDemo
{
   public void follow()
   {
     System.out.println("Say Hello to user:) Hi ");
   }

}
