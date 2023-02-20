//*Develop a program to create employee table in database having two columns enp-id and emp-name
import java.sql.*;
import java.io.*;
class JDBCDemo
{
	public static void main(String args[])
	{
			int id;
			String name;
				DataInputStream data=new DataInputStream(System.in);
				Connection con;
				Statement st;
		try
		{
			System.out.println("\n\nEnter ID:- ");
			id = Integer.parseInt(data.readLine());
			
			System.out.println("\n\nEnter Name:- ");
			name=data.readLine();
			
			Class.forName("sum.jdbc.odbc.JdbcOdbc");
			con=DriverManager.getConnection("jdbc:odbc:employee");
			st=con.createStatement();
			String table="create table empifo(empid Number,empname VARCHAR(30))";
			
			String querry = "insert into empifo(empid,empname)values("+id+","+name+")";
			
			st.executeUpdate(table);
			System.out.println("\n\nTable Create: ");
			
			st.executeUpdate(querry);
			System.out.println("\n\n Data Inserted: ");
			
			st.close();
			con.close();
		}
		catch(SQLException e)
		{
			System.out.println("\n\n SQL Error");
		}
		catch(Exception e)
		{
			System.out.println("\n\nError "+e);
		}
	}


}