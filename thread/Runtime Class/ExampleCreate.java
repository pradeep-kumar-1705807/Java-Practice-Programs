public class ExampleCreate
{
	public static void main(String args[])throws Exception
	{
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory :-"+r.totalMemory());
		System.out.println("Free  Memory :-"+r.freeMemory());
		for(int i=0;i<999999999;i++)
		{
	//		for(int j=0;j<99999999;j++)
	   		for(int k=0;k<99999999;k++)
					new ExampleCreate();
		}
		System.out.println("Total Memory :-"+r.totalMemory());
		System.out.println("Free  Memory :-"+r.freeMemory());
	}
	
}