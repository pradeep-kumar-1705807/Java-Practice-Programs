public class Example4
{
	public static void main(String args[])
	{
		String s1="Pradeep";
		String s2="Pradeep";
		String s3=new String("Pradeep");
		String s4=new String("Pradeep");
		System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1.concat(s2).concat(s3));

	}
	
}