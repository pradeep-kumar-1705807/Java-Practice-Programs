public class SetThreadName
{
	public static void main(String args[])
	{
		Thread thread=Thread.currentThread();
		System.out.println("Main Thread is name \" "+thread.getName()+"\"" );
		thread.setName("Pradeep's Thread");
		System.out.println("Main Thread is name \" "+thread.getName()+"\"" );
	}
}