class A
{
  static int x;
  int y;
  static
  {
    x=9;
    System.out.println("Static Initilisation Block 1");
  }
static  {
    System.out.println("Static Initilisation Block 2");
  }
  A()
  {
    System.out.println("Constructor");
  }
}
public class Example1
{

  public static void  main(String args[])
  {
      A a1=new A();
  }
}
