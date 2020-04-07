import java.util.*;
public class Array
{
public static void main(String args[])
{
int sum=0;
int arr[]=new int[10];
int i=0;
Scanner cin=new Scanner(System.in);
System.out.println("Enter the elements inb the array : ");
for(i=0;i<10;i++)
{
arr[i]=cin.nextInt();
}

for(i=0;i<10;i++)
{
sum=sum+arr[i];
}

System.out.print("Sum of all the :-"+sum);

}
}