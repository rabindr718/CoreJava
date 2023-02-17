package ScrollStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) {
		
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con =DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi","mef190570107137","mef190570107137");
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("update bank set balance=BALANCE+? where ACC_NO=?");
			ps.setInt(1, 6000);
			ps.setInt(2, 045);
			int i=ps.executeUpdate();
			
			ps.setInt(1, -6000);
			ps.setInt(2, 054);
			int j=ps.executeUpdate();
			
			if(i==1 && j==1)
			{
				con.commit();
				System.out.println("Transaction successfully compeleted");
				con.rollback();
			} else {
				System.out.println("Cannot Transfer the Amount");
				con.rollback();
			}
			
	}
		catch(Exception e) {
			e.printStackTrace();
			
		
		
		 }
	}
}