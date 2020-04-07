import java.net.*;
import java.util.*;
class InetAddressTest
{
	public static void main(String args[]) throws MalformedURLException,UnknownHostException
	{
		
		InetAddress address=InetAddress.getLocalHost();
		System.out.println(address);
	  /*  address= InetAddress.getByName("https://www.google.com");
		System.out.println(address);*/
		
		InetAddress SW[]=InetAddress.getAllByName("www.nba.com");
		//System.out.println(address);
		for(int i=0;i<SW.length;i++)
		{
			System.out.println(SW[i]);
		}
		
		
		
		
	}
}