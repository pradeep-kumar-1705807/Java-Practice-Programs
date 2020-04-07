package inheritance;
public class A
{
public int x;
{
x=2;	
}
public void display()
{
System.out.println("Class A "+x);
}
public class B extends A
{
public int x;
{

}
public void  display()
{
System.out.println(" class A"+super.x);
}
}
public static void main(String args[])
{
A a1=new A();
a1.display();
}
}