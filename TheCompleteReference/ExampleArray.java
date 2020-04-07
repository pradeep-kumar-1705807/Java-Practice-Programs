class ExampleArray
{
	public static void change(int ar[])
	{
		for(int i=0;i<ar.length;i++)
			ar[i]=-ar[i];
	}
	public static void main(String args[])
	{
		int arr[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			arr[i]=i+1;
		}
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}
		change(arr);
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}