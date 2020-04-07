class Example2
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2="HEllo";
		StringBuffer sb1=new StringBuffer("Welcome to java");
			
		System.out.println(s1==s2);
		System.out.println("Length   :- "+sb1.length());
		System.out.println("Capacity :-"+sb1.capacity());
	    sb1.ensureCapacity(50);
	    sb1.setLength(100);
		System.out.println("Length   :- "+sb1.length());
		System.out.println("Capacity :-"+sb1.capacity());
		for(int i=0;i<6;i++)
		{
			sb1.setCharAt(i,(char)(i+65));
			System.out.println(sb1.charAt(i));
		}

	}
}