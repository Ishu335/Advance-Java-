/*Write a program using URL class to retrieve the host, protocol, port and file of
URL http://www.msbte.org.in*/

import java.net.*;
import java.io.*;
public class URLDemo
{
	public static void main(String args[]) throws Exception
	{
			try
			{
				URL u = new URL("https://www.msbte.com/mainsite/");
				
				 System.out.println("/n/nProtocal :"      + u.getProtocol());
				System.out.println("/n/nPortNO :" 	     +u.getPort());
				System.out.println("/n/nHostName :"		 +u.getHost());
				System.out.println("/n/nFileName :" 	 +u.getFile());
				System.out.println("/n/External Form  :" +u.toExternalForm());
			}
			catch(Exception e)
			{
				System.out.println("\n\n\nError");
			}
	} 
}