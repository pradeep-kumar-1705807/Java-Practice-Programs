import java.util.*;
public class Dynamic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0;
System.out.println("Enter the size of the array : ");
int n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

for(i=0;i<n;i++)
{

System.out.print(arr[i]+" ");
}
}
}