import java.io.*;
public class  Example6
{
  public static void main(String[] args) throws Exception
  {  
    FileWriter f1=new FileWriter("file.txt");
    String s="The Complete Reference ";
    f1.write(s);
   f1.close();
  }
}