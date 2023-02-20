
import java.io.*;
import java.sql.*;
 public class DataBase 
 {
	public static void main(String args[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
			Statement st=con.createStatement();
			
			String query ="create table studentR(num INTEGER,name varchar(30))";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.executeUpdate();
			System.out.println("\n\nTable Create");
			
			String sqlquery="INSERT into studentR(num,name)VALUES(?,?)";
			PreparedStatement pstmt2=con.prepareStatement(sqlquery);
			
			DataInputStream in=new DataInputStream(System.in);
			System.out.println("\n\nEnter Code= ");
			int code = Integer.parseInt(in.readLine());
			pstmt2.setInt(1,code);
			System.out.println("\n\nEnter Name= ");
			String nam=in.readLine();
			pstmt2.setString(2,nam);
			
			int count=pstmt2.executeUpdate();
			System.out.println("\n\nNumber of Records= "+count);
			
			ResultSet rs =st.executeQuery("Select*from studentR");
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int numberOfColumns=rsmd.getColumnCount();
			
			 System.out.println("\n\n");
			 while(rs.next())
			 {
				for(int i=1;i<=numberOfColumns;i++)
				{
					if(i>1)
					System.out.println(",");
					String ColumValue=rs.getString(i);
					System.out.println(ColumValue);
				}
				System.out.println("");
			 }
			 st.close();
			 con.close();
		}
		catch( Exception ex)
		{
			System.out.println(" Exception ");
			System.out.println(ex.getMessage());
		}
		
	}
 }