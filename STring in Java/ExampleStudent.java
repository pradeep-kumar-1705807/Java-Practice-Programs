public class ExampleStudent
{
	private int    roll;
	private String name;
	private String  city;
	ExampleStudent(int roll,String name,String city)
	{
		this.roll=roll;
		this.name=name;
		this.city=city;

	}
	 public static void main(String[] args) 
	 {
	 	ExampleStudent s1=new ExampleStudent(4,"Pradeep Kumar","Ranchi");
	 	ExampleStudent s2=new ExampleStudent(5,"Sanket Kumar","Dubai");
	 	System.out.println(s1.toString());
	 	System.out.println(s2.toString());

	}
}