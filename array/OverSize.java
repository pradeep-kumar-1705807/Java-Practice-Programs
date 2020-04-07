import java.util.Scanner;
public class OverSize
{
public static void main(String args[])
{
int i;
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
for(i=0;i<5;i++)
{
arr[i]=sc.nextInt();
} 
for(i=0;i<5;i++)
{
System.out.print(arr[i]);
} 
}
}