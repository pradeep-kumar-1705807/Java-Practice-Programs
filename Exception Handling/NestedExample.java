public class NestedExample
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			int b=64/a;
			System.out.println("a= "+a);
			try
			{
				if(a==1)
					a=a/(a-a);
				if(a==2)
				{
					int c[]={1};
						c[99]=43;
				}
			}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array out of bound Exception Inner try Block");
				}
			
			
		}
		catch(ArithmeticException r)
		{
			System.out.println("Divide By Zero Error");
		}
	}
}