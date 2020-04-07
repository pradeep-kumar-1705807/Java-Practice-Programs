package newperson;
public class MyPerson
{
private	String name;
private Integer age;
private String address;
public void getName(String n)
 {
 	name=n;

 }
 public void getAge(Integer a)
 {
 	age=a;
 }
public void getAddress(String add)
{
	address=add;
}
public void display()
{
	System.out.println("Name   :"+name);
	System.out.println("Age    :"+age);
	System.out.println("Adress :"+address);
}
MyPerson(){

}
public static void main(String args[])
{
	MyPerson p1=new MyPerson();
	p1.display();
}
}
