class Example6
{
  public static void main(String args[])
  {
    try
    {
      int a=args.length;
      System.out.println("a = "+a);
      int c[]=new int[1];
      c[43+42/(a+1)]=90;
    }
    catch(ArithmeticException e)
    {
      System.out.println("Divide By Zero Error ");

    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array Out of Exception");

    }

  }
}
