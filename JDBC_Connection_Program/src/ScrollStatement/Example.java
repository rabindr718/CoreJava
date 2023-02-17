package ScrollStatement;
import java.sql.*;
public class Example {
//PreparedStatement_Program
	public static void main(String[] args) {
        
	    try {
	              Class.forName("oracle.jdbc.driver.OracleDriver");
	                           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107137","mef190570107137");
	                           PreparedStatement pst = con.prepareStatement("select * from EMP where EMPID=?");
	                           pst.setInt(1,102);
	                  ResultSet rs = pst.executeQuery();
	                  while(rs.next())
	                  {
	                           System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
	                  }
	                  System.out.println("After inserting value");
	                  PreparedStatement pst1 = con.prepareStatement("insert into emp values(?,?,?,?)");
	                  pst1.setInt(1, 10000);
	                  pst1.setString(2,"Dhoni");
	                  pst1.setString(3,"CE");
	                  pst1.setInt(4,5000);
	                 
	                  pst1.executeUpdate();
	                  rs = pst1.executeQuery("select * from emp");
	                  while(rs.next())
	                  {
	                           System.out.println(rs.getString(1)+ "  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
	                  }
	             
	    }catch(Exception e)
	    {
	              System.out.println("An error occur"+e);
	    }
	              }

}
