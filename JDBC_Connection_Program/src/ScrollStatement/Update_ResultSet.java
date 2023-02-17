package ScrollStatement;
import java.sql.*;
public class Update_ResultSet {

	public static void main(String[] args)  throws Exception  { 
	
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107137","mef190570107137");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("Selectroll, name,city, from Student");
        rs.next();
        rs.updateInt(1,1001);
        rs.updateString(1,"Ram");
        rs.updateRow();
        System.out.println("1 Row UPDATED...");
        rs.moveToInsertRow();
        rs.updateInt(1, 1002);
        rs.updateString(1, "David");
        rs.insertRow();

        System.out.println("1 Row Inserted..."); 
        System.out.println("After Updation...");
        con.close();
	}
	
}


