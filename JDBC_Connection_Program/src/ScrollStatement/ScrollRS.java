package ScrollStatement;
import java.sql.*;

public class ScrollRS {

	public static void main(String[] args, Statement st, Statement cn) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con =DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107137","mef190570107137");
					
			Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs= st.executeQuery("select RNO, SNAME, SDEPT, SCLASS from STUDENT");
			
			rs.absolute(2);
			System.out.println(rs.getString(0) +" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			System.out.println("current position of rs is " + rs.getRow());
			rs.first();
			System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			rs.last();
			System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			rs.updateString(2,"EC1 Rahul");
			rs.updateString(3, "MEFGI GTU");
			rs.updateRow();
			System.out.println(rs.getString(1)+" " + rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			rs.absolute(0);
			rs.deleteRow();
			rs.moveToInsertRow();
			rs.updateInt(1, 75);
			rs.updateString(2, "New Record EC1");
			rs.updateString(3, "New Address EC1");
			rs.insertRow();
			cn.close();
			
			}catch(Exception e){ System.out.println(e);}  

		}
}
