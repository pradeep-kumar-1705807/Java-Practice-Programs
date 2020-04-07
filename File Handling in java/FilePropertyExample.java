import java.io.File;
public class FilePropertyExample
{
	public static void main(String args[])
	{
		File f1=new File("G:\\testfile.txt");
		System.out.println(" IS FILE EXIST :- "+f1.exists());
		System.out.println(" FILE NAME     :- "+f1.getName());
		System.out.println(" CAN WRITE     :- "+f1.canWrite());
		System.out.println(" LENGTH        :- "+f1.length());
	}
}