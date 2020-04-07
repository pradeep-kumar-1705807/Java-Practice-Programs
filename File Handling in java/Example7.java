import java.io.*;
public class Example7
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader f=new InputStreamReader(System.in);
        BufferedReader bout=new BufferedReader(f);
        System.out.println("Enter Your Name :-");
        String name=bout.readLine();
        System.out.println("Welcome "+name);
		
	}
}
	