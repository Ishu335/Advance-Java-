//Factroil Progarme Client
import java.io.*;
import java.net.*;
class ClientProFactorial 
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
			
			
			
				System.out.println("\n\nEnter The Number:- ");
				String str1= sc.readLine();
				// int a=Interger.parseInt(str1);
				dataout.writeUTF(str1);
				String str2= datain.readUTF();
				System.out.println("\n\nFractional Number:- "+str2);
			
		}catch(Exception e){}
		
	}
}