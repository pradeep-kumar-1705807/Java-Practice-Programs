class Box
{
	double height;
	double width;
	double length;
	Box(double height ,double width, double length)
	{
		this.height=height;
		this.width=width;
		this.length=length;
	}
	Box()
	{
		this.height=0;
		this.width=0;
		this.length=0;
		
	}
	public void volume()
	{
		double v=this.height*this.width*this.length;
		System.out.println("Volume of the Box is "+v);
	}
	public static void show()
	{
		System.out.println("This is static method ");
	}

}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b1=new Box(12,13,14);
		b1.volume();
	}
}