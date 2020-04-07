import java.util.*;
public class TwoDimension
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int arr[][],i,j;
arr=new int[3][3];
System.out.println("Enter the Elements of the 2-D array ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(arr[i][j]+" ");
}

System.out.print("\n");
}
}}