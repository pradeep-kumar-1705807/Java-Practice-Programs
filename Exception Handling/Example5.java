class Example5
{
  static void sub()
  {
    int d=0;
    int k=42/d;

  }
  static void hub()
  {
    sub();
  }
  static void gub()
  {
    hub();
  }
  public static void main(String args[])
  {
    try
    {
      gub();
      System.out.println("Print this Statement");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Division by Zero Exception");
    }
  }
}
