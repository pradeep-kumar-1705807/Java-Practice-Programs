class Time
{
	int hr;
	int min;
	int sec;
	Time(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		
	}
	void getTime()
	{
		System.out.println(hr+" : "+min+" : "+sec);
	}
}
class Student 
{
	String name;
	int roll;
	static Time departure=new Time(2,30,00);  //static Object 
	Student()
	{
		name="Pradeep Kumar";
		roll=12;
	}
	void display()
	{
		System.out.println("Name           : "+name);
		System.out.println("Roll No        : "+roll);
		System.out.println("Departure Time : ");
		Student.departure.getTime();
	}
}
class ExampleStatic1
{
	public   void display()
	{
		//static int x=10;
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.display();
	}
}
		
	