class Example4
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
  gub();

  }
}
