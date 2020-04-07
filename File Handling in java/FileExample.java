import java.io.*;
class FileExample
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("g:/java programs/FileData/FileExample.txt");
		f1.createNewFile();
		System.out.println("Can Read File      : "+f1.canWrite());
		System.out.println("Is File Exists     : "+f1.exists());
		System.out.println("File Name          : "+f1.getName());
		System.out.println("Lenght of the file : "+f1.length());
		
	}
	
}