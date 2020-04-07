class Example6
{
  int a;
  int b;
  int c;
  int d;
  Example6(int a1,int b1,int c1)
  {
    System.out.println("3parameter constructor");
  }
  Example6(int a1,int b1,int c1,int d1)
  {
    this(a1,b1,c1);
    System.out.println("4parameter constructor");
  }
  public static void main(String args[])
  {
    Example6 e1=new Example6(1,2,3,4);
  }
}
