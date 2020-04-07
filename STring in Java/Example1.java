public class Example1
{
	public static void main(String args[])
	{
		String s1=new String("Hello World");
		s1="welcome";
		String s2="WELCOME";
		System.out.println(s1);
		System.out.println(s1.charAt(3));
		int start=3;
		int end=5;
		char ch[]=new char[end-start];
		s1.getChars(start,end,ch,0);
		System.out.println(ch);
		System.out.println(s1.getBytes());
		System.out.println(s1.toCharArray());
		if(s1.equals(s2))
		{
			System.out.println(" s1 and s2 strings are equals ");
		}
		if(s1.equalsIgnoreCase(s2))
			System.out.println(" S1 and s2 are in same but in opposite case ");

	}
}