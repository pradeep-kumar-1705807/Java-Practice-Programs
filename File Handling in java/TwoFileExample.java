import java.io.*;
public class TwoFileExample
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream input1=new FileInputStream("g://data1.txt");
		FileInputStream input2=new FileInputStream("g://data2.txt");
		SequenceInputStream se=new SequenceInputStream(input1,input2);
		int j;
		while((j=se.read())!=-1)
		{
			System.out.print((char)j);
		}
		se.close();
		input1.close();
		input2.close();
	}
}