public class Bubblesort
{
public static void main(String args[])
{
int i,j,temp;
int A[]={9,8,7,6,5,4,3,2,1,0};
for(i=0;i<10;i++)
{
for(j=0;j<10-i-1;j++)
{
if(A[j]>A[j+1])
{
temp=A[j];
A[j]=A[j+1];
A[j+1]=temp;
}
}
}
for(i=0;i<10;i++)
System.out.println(A[i]+ " ");

}
	


}