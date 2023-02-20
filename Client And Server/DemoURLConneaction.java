/*Write a program using URL and URLConnection class to retrieve the date,
content type, content length information of any entered URL*/
 
 import java.net.*;
 import java.io.*;
 import java.util.*;
 class DemoURLConneaction 
 {
		public static void main(String args[]) throws Exception
		{	
			int c;
		
			URL url = new URL("https://www.java.sample.com/jzmel/");
			URLConnection urlco = url.openConnection();
			
			System.out.println("URL class methods :- ");
			System.out.println("Protocol:- "+url.getProtocol());
			System.out.println("Port:- "+url.getPort());
			System.out.println("File:- "+url.getFile());
			System.out.println("HostName :"		 +url.getHost());
			
			
			System.out.println("\nURLConnection class");
			System.out.println("Date:- "+urlco.getDate());
			
			Date d1=new Date(urlco.getExpiration());
			System.out.println("ContentType:- "+d1);
			
			Date d2=new Date(urlco.getLastModified() );
			System.out.println("Expires:- "+ d2 ) ;	
			
			int len =urlco.getContentLength();
				System.out.println("Content Length: "+len );
				
				try
				{
					if(len>0)
					{
						System.out.println("\n\nContunt");
						InputStream input =urlco.getInputStream();
							int i=len;
							while(((c=input.read())!=-1 )&&(i>0))
							{
								System.out.println(c);
							}
							input.close();
					}
					else
					{
						System.out.println("n\n NO Content Available");
					}
				}
				catch(Exception e)
				{
					System.out.println("Error :- "+e);
				}	
		}
 }	