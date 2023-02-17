import java.sql.*;
public class GET_BALANCE {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@119.160.199.94:1521:mefgi",
					"mef190570107137", "mef190570107137");
			Statement smt = con.createStatement();
			CallableStatement cs = con.prepareCall("{call getBalance(?)}");
			cs.setInt(1, 234567);
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int Balance = cs.getInt(1);
			System.out.println("Balance : " + Balance);
			con.close();

		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
