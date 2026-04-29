package projectcms;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/canteen_db", "root", "9019@chaitra" // change to
																											// your
																											// MySQL
																											// password
			);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
