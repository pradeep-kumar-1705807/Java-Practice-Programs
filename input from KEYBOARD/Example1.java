import java.util.*;
public class Example1
{
public static String fname;

public static String lname;
public  static int age;
public static void main(String args[])
{

Scanner cin=new Scanner(System.in);

System.out.println("Enter the First name of the person :- ");

Example1.fname=cin.next();

System.out.println("Enter the Last name of the person :- ");

Example1.lname=cin.next();

System.out.println("Enter a age of the person");

Example1.age=cin.nextInt();

System.out.println("Name :- "+Example1.fname+" "+Example1.lname +"\nAge :- "+Example1.age);
}
}