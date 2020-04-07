interface Eatable
{
	void eat();
}
public class ExampleUju
{
	public static void main(String args[])
	{
		Eatable e1=new Eatable(){
		public	void eat()
			{
				System.out.println("Chicken Chilly");
		    }  
		};
		e1.eat();
		Eatable e2=new Eatable(){
		public	void eat()
			{
				System.out.println("Chicken Chilly");
		    }  
		};
		e2.eat();
	}
}