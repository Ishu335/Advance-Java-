////Factroil Progarme Server

import java.io.*;
import java.net.*;
class ServerProFactorial
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
				
			 
					int fact=1;
				    
 					String str1= datain.readUTF();
						int a=Integer.parseInt(str1);
						
						System.out.println("\n\nServer Recieved Cleint Number:- "+a);
						
						for(int i=1;i<=a;i++)
						{
							fact=fact*i;
						}
						
						String str2 = String.valueOf(fact);
						dataout.writeUTF(str2);		
					
			 	
			}
			catch(Exception e){}
		
	}
}