package advjava;
import java.sql.*;
public class jdbcconnection 
{
	public static void main(String args[]){   
	try
	{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/jdbctest","root","root");  
	//here student is database name, root is username and password  
	Statement stmt=con.createStatement();  
	
	//insert - update statement
	//int result = stmt.executeUpdate("insert into emp(empname,empid, empadd) values('aadvika', 003, 'Bhopal')");
	//if (result > 0)
    //System.out.println("Successfully Inserted");
    //else
    //System.out.println("Insertion Failed");
	
	//update statement
	int result = stmt.executeUpdate("update emp set empname='RAM' where empid=3");
	if (result > 0)
    System.out.println("successfully Updated");
    else
    System.out.println("Update failed");
	
    //3 lines to exe select statement
 	ResultSet rs=stmt.executeQuery("select * from emp");  
 	while(rs.next())  
 	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
     
    //close connection
    con.close();  
	}
	catch(Exception e){ System.out.println(e);} 
	}
}