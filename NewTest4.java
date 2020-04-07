package string;
public class NewTest4
{
	public static void main(String []args)
	{
		StringBuffer sb=new StringBuffer("he");
		sb=sb.append(" is a good boy");
		System.out.println(sb);
		System.out.println("Reverse of the string "+sb.reverse());
		System.out.println("deletion :- "+sb.delete(4,8));
	}
}
