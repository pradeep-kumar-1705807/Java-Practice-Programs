class E
{
public final void printf()
{
System.out.println("Class E");
}
}

public class F extends E
{
public  void printf(int x)
{
System.out.println("Class F");
} 
public static void main(String []args)
{
E obj=new E();
final int x=(19);
obj.printf();
System.out.println("Value of X:- "+x);

}
}
