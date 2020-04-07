public class Example
{
public static void main(String args[])
{
  Student s1= new Student();
  s1.setName("Pradeep Kumar");
  s1.setEmail("kumarpradeep2008.1@gmail.com");
  s1.setAge(18);
  s1.setRoll(807);
  s1.setMarks(95);
  System.out.println("Name     :-"+s1.getName());
  System.out.println("Age      :-"+s1.getAge());
  System.out.println("E-mail   :-"+s1.getEmail());
  System.out.println("Roll No. :-"+s1.getRoll());
  System.out.println("Marks    :-"+s1.getMarks());


}
}
