import java.io.*;
import java.net.*;
class Server
{
	public static void main(String args[])
	{
			try
			{
				ServerSocket ss=new ServerSocket(3456);
				Socket s=ss.accept();
				System.out.println("\n\nServer Started....");
				System.out.println("\n\nCliented to Server....");
				
				InputStream input= s.getInputStream();
				OutputStream output= s.getOutputStream();
			
				DataInputStream datain =new DataInputStream(input);
				DataOutputStream dataout =new DataOutputStream(output);
				
				BufferedReader  sc=new BufferedReader( new InputStreamReader (System.in));
				
			
				while(true)//Infinite Loop
				{
				    	String str1= datain.readUTF();
					    System.out.println("\n\nServer Recieved Cleint Name:- "+str1);
						System.out.println("\n\nEntered Cleint Id:- ");
						String str2= sc.readLine();
						dataout.writeUTF(str2);
					
				}
			}
			catch(Exception e){}
		
	}
}