import java.util.*;
public class FindRemainder
{
public static void main(String a[])
{
int i,t;
int A[]=new int[1000];
int B[]=new int[1000];
Scanner cin =new Scanner(System.in);
t=cin.nextInt();
for(i=0;i<t;i++)
{
A[i]=cin.nextInt();
B[i]=cin.nextInt();
}
for(i=0;i<t;i++)
{
System.out.println(A[i]%B[i]);
}

}
}