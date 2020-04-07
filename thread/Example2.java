class F extends A implements Runnable
{
public void run()
{
int i=0;
for(i=0;i<=10;i++)
System.out.println("Thread F"+i);
}
}
public class Example2
{
public static void main(String args[])
{
Thread t1=new Thread(new F());
Thread t2=new Thread(new A());
Thread t3=new Thread(new B());
t1.start();
t2.start();
t3.start();

}

}

