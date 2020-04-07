public class InitialisationBlock

{
	private int x;
	{
		x=50;

	}
        protected InitialisationBlock()
	    {
	        x=90;
	     }
	public int  showData()
	{
		return x;

	}
	public static void main(String[] args) {
		InitialisationBlock i1=new InitialisationBlock();
		System.out.println("Value of X is :-"+i1.showData());
	}
}