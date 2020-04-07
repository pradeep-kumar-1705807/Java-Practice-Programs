class C extends Thread
{
public void run()
{
int i;
for(i=0;i<10;i++)
{
System.out.println("Thread C: "+i);
}
}
}
class D extends Thread
{
public void run()
{
int i;
for(i=0;i<10;i++)
{
System.out.println("Thread D: "+i);
}
}
}
public class Example1
{
public static void main(String args[])
{
C obj1=new C();
D obj2=new D();
obj1.start();
obj2.start();
}
}
