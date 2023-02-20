/*Develop a program using InetAddress class to retrieve IP address of computer
when hostname is entered by the user.*/

import java.io.*;
import java.net.*;

public class DemoInetAddress 
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ip=InetAddress.getByName("www.javatpoint.com");
			
			System.out.println("/n/n getByName:- "+ip);
			
			System.out.println("Host Name:- "+ ip.getHostName());
			System.out.println("IP address:- "+	ip.getHostAddress());
			
				
			InetAddress	ips[]=InetAddress.getAllByName("www.msbte.com");
			
			for(int i=0;i<ips.length;i++)
			{
				System.out.println("/n/n"+ips[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}