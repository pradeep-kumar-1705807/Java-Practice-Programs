//package studentobject;
import student.*;
public class StudentObject
{
public static void main(String []args)
{
Student s1=new Student();
s1.setName("pradeep");
s1.setRoll(13);
System.out.println("Roll no. :- "+s1.returnRoll());
System.out.println("Name :- "+s1.returnName());
}
}