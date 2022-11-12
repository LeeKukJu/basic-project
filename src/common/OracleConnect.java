package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnect {
	
	public static Connection connection;
	public static Statement statement;
	
	public static void jdbcDriver() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.34.16:1521:xe";
		String user = "project_team1";
		String password = "sand";

		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, password);
		statement = connection.createStatement();
		

	}
}
