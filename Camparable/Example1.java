import java.util.*;
class A implements Comparable<A>
{
	int a;
	public int compareTo(A obj)
	{
		if(a==obj.a)
			return 0;
		else if(a>obj.a)
			return 1;
		else 
			return -1;
	}
}
public class Example1
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    A temp;
		A arr[]=new A[100];
		System.out.println("Enter the number of Elements in the array ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=new A();
			arr[i].a=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])<0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;

				}

			}
		}
		System.out.println("After Sorting the Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].a+" ");
		}

	}
}