import java.sql.*;

public class Firstday {
	public static void main(String args[])
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107137","mef190570107137");
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from student");
		while(rs.next())
		{
		System.out.println("Name is:"+rs.getString("sname"));
		System.out.println("Student Department:"+rs.getString("sdept"));
		System.out.println("Roll Number:"+rs.getString("rno"));
		System.out.println("Student Class:"+rs.getString("sclass"));
		}
		}catch(Exception e)
		{
			System.out.println("An erro occur: "+e);
		}
	}

}
