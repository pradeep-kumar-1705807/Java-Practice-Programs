interface Animal
{
  void eat();
  void show();
}
 abstract class Lion implements Animal
{
  //abstract public  void eat();
  //abstract public void show();
}
class Example2 extends Lion
{
  public  void eat()
  {
    System.out.println("Eating");
  }
  public  void show()
  {
    System.out.println("Sleeping");
  }
  public static void main(String args[])

  {
    (new Example2()).eat();
    (new Example2()).show();
  }
}
