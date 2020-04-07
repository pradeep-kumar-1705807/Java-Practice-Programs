import java.net.*;
import java.io.*;
import java.util.*;
class HttpURLDemo
{
	public static void main(String args[]) throws Exception
	{
		URL hp= new URL("http://www.google.com");
		HttpURLConnection hpcon=(HttpURLConnection) hp.openConnection();
		
		System.out.println("Request method is "+hpcon.getRequestMethod());
		
		
		System.out.println("Request code is "+hpcon.getResponseCode());
		
		System.out.println("Request message is "+hpcon.getResponseMessage());
		
		Map<String,List<String>> hdrMap=hpcon.getHeaderFields();
		Set<String> hdrField=hdrMap.keySet();
		System.out.println("Here is the Header ");
		
		for(String k:hdrField)
		{
			System.out.println("Key : "+k+ "Values :"+hdrMap.get(k));
		}
	}
}