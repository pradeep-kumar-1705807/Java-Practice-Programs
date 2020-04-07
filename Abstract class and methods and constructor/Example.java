class A
{

public A()
{
System.out.println("Constructor of class A");
}
}
class B extends A
{
public B()
{
super();
System.out.println("Constructor of class B");
}
public void printf()
{
System.out.println("Hello World");
}
}
class C extends B
{
public C()
{

}
}
public class Example 
{
public static void main(String args[])
{
B obj=new B();
obj.printf();
}
}