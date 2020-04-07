class A
{
	 private int x;
	 A()
	 {
	 	System.out.println("Outer Class");
	 }


	class B
	{
		B()
		{
			System.out.println("class B");
		}
		private int y;
		B()
		{

		}

	}
}