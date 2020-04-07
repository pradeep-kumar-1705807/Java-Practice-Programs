import java.io.*;
import java.util.*;
class Student
{
    int id;
    float gpa;
    float physics;
    float chemistry;
    float maths;
    float specialExams;
    String pref1;
    String pref2;
    String pref3;
    public void setId(int id)
    {
        this.id=id;   
    }
    public void setGPA(float gpa)
    {
       this.gpa=gpa;
       
    }
    public void setPhysics(float phy)
    {
        this.physics=phy;
    }
    public void setChemistry(float chem)
    {
        this.chemistry=chem;
    }
    public void setMaths(float maths)
    {
        this.maths=maths;
    }
    public void setChemistry(float specialExams)
    {
        this.specialExams=specialExams;
    }
    public void setPreference1(String str)
    {
        this.pref1=str;
    }
     public void setPreference2(String str)
    {
        this.pref2=str;
    }
      public void setPreference3(String str)
    {
        this.pref3=str;
    }
    public int getId()
    {
    	return this.id;
    }
     public float getPhysics()
     {
     	return this.physics;
     }
     public float getChemistry()
     {
        return this.chemistry;
     }
    public float getMaths()
     {
     	return this.maths;
     }
     public float getSpecialExams()
     {
     	return this.specialExams;
     }
     public String setPreference1()
     {
    	return this.pref1;
     }
    public String setPreference2()
    {
         return this.pref2;
    }
    public String setPreference3()
    {
        return this.pref3;
    }
     
     
}
public class RussianStartup
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader in = new BufferedReader(new FileReader("Startup.txt"));
    String str;

List<String> list = new ArrayList<String>();
while((str = in.readLine()) != null){
    list.add(str);
}

String[] stringArr = list.toArray(new String[0]);
    /*  for(int i=0;i<stringArr.length;i++)
      {
      	System.out.println(stringArr[i]);
      }*/

     String prop[]=stringArr[0].split(" ");
     for(int i=0;i<prop.length;i++)
      {
      	System.out.println(prop[i]+"---");
      }

	}
} 