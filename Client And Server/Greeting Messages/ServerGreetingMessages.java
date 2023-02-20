// Greeting Messages Progarme Server

import java.io.*;
import java.net.*;
class ServerGreetingMessages
{
	public static void main(String args[])
	{
			try
			{
				ServerSocket ss=new ServerSocket(3450);
				Socket s=ss.accept();
				
				System.out.println("\n\nServer Started....");
				System.out.println("\n\nCliented to Server....");
				
				InputStream input= s.getInputStream();
				OutputStream output= s.getOutputStream();
			
				DataInputStream datain =new DataInputStream(input);
				DataOutputStream dataout =new DataOutputStream(output);
				    
 					String str1= datain.readUTF();
						String msg="Hello ";
						String str2=msg+str1;
						dataout.writeUTF(str2);		
					
			 	
			}
			catch(Exception e){}
		
	}
}