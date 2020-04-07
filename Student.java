package person;
interface person
{
  String name="pradeep";
  String father_name="dilip";
  public String returnName();
  public String returnFatherName();
}
public class Student implements person{

  int roll;
  float marks;

  public  void setRoll()

  {
    roll=1;
  }
  public  void setMarks()

  {
    marks=97;
  }
  public String returnName()
  {
    return name;

  }
  public String returnFatherName()
  {
    return father_name;
  }
  public int returnRoll()
  {
    return roll;
  }
  public float returnMark()
  {
    return marks;
  }
  Student()
  {


  }


public static void main(String []args)
{
  Student s1=new Student();
System.out.println("MARKS : "+s1.returnMark());
  s1.returnRoll();
  s1.returnName();
  s1.returnFatherName();
}
}
