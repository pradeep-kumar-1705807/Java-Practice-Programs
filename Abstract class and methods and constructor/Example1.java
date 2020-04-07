abstract class D
{
public D()
{
System.out.println("contructor of D");

}
public void fun1()
{
	System.out.println("fun1() is called");
}
}
class E extends D
{
public E()
{
System.out.println("Constructor of class E");
}
public void fun2()
{
System.out.println("fun2() is called");
}
}
public class Example1
{

public static void main(String args[])
{
D obj=new E();
obj.fun1();
//obj.fun2();
}
}  