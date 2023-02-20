//Greeting Messages Progarme Client
import java.io.*;
import java.net.*;
class ClientGreetingMessages
{
	public static void main(String args[])
	{
		InetAddress ip=null; 
		try
		{
			try
			{
				ip=InetAddress.getLocalHost();
				System.out.println("\n\nLocal Host:- "+ip);
			}
			catch(Exception e)
			{}
			Socket socak=new Socket(ip,3450);
			InputStream input= socak.getInputStream();
			OutputStream output= socak.getOutputStream();
			
			DataInputStream datain =new DataInputStream(input);
			DataOutputStream dataout =new DataOutputStream(output);
			
			BufferedReader  sc=new BufferedReader( new InputStreamReader (System.in));
			System.out.println("\n\n Client Started");
			
			
			
				System.out.println("\n\nEnter The User name:- ");
				String str1= sc.readLine();
				
				dataout.writeUTF(str1);
				String str2= datain.readUTF();
				System.out.println("\n\nMessage from Server:- "+str2);
			
		}catch(Exception e){}
		
	}
}