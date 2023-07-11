package a.b.c.ch7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String user = "scott";
		String password = "tiger";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement stmt = conn.createStatement();
		ResultSet rsRs = stmt.executeQuery("SELECT * FROM T1_TABLE");
		while (rsRs.next()) {
			System.out.print(rsRs.getString(1) + " ");
			System.out.print(rsRs.getString(2) + " ");
			System.out.println(rsRs.getString(3));

	}

}
}
