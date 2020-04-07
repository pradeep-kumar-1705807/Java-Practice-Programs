public class Student extends Person
{
private int roll;
private float marks;
private String email;
public void setEmail(String e)
{
  email=e;
}

public void  setRoll(int r)
{
roll=r;

}
public void setMarks(int m)
{
  marks=m;

}
public String getEmail()
{
  return this.email;
}

public int getRoll()
{
return this.roll;

}
public float getMarks()
{
  return this.marks;

}
}
