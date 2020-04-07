interface Abhishek
{
	int x=8;
	public abstract void fun1();
}
class BExample 
{
	public static void main(String args[])
	{
		Abhishek obj=new Abhishek(){
			
			public void fun1()
			{
				System.out.print("Hello World");
			}
		};
	
		obj.fun1();
		System.out.println(Abhishek.x);
	
	}
}