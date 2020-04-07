import java.util.*;
class List1
{
public	int data;
public  List1 ptr;
}
public class ExampleLinkedList1
{
	static List1 first=null;
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		List1 node=new List1();
		node.data=30;
		node.ptr=null;
		first=node;
		System.out.println("Press Y|y to continue  more");
		ch=sc.next().charAt(0);
		while(ch=='y'||ch=='Y')
		{
			node.ptr=new List1();
			node=node.ptr;
			System.out.println("Enter the value :- ");
			node.data=sc.nextInt();
			node.ptr=null;
			System.out.println("Press Y|y to continue  more");
		    ch=sc.next().charAt(0);
			
		}
	}
	
	public static void main(String args[])
	{
		create();
		List1 node=first;
		System.out.println(node.data);
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.ptr;
	    }
	}
}