class Box
{
  int x;

  Box(int x)
  {
    this.x=x;

  }
  void fun1()
  {
    System.out.println(x);
  }
}

class Example12
{
  public static void main(String[] args)
  {

    Box b1[]=new Box[10];
for(int i=0;i<10;i++)
{
    b1[i]=new Box(i);
    b1[i].fun1();
  }
  }
}
