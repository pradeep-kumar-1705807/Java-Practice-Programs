class Example10
{
	 int x=10;
	 void fun1(int a ,int b)
	 {
	 }
	 void fun1(float c)
	 {
		 System.out.println(c);
	 }
	public static void main(String []args)
	{
		boolean f=true;
		Example10 e1=new Example10();
		e1.fun1(e1.x);
		System.out.println(""+e1.x);
		
	}
}