class A
{
public static int a;
int b=10;
 static {
 	a=8;
    System.out.println("Hello World");
  }
  public void fun1()
  {
  	System.out.println(a);
  	fun2();
  }
  static public void fun2()
  {
  	System.out.println(a);
  //	fun1();
  }
}

public class Example 
{
	static {
		System.out.println("Before main");

	}

public  static  void main(String args[])
{

	//System.out.println("Heello Gandu");
	A a=new A();
	A.fun2();
	a.fun1();
	a.fun2();
//	Example e1=new Example();
//B obj=new B();
//System.out.println("Static mamber of class :- "+B.a);
//obj.showData();
}
}