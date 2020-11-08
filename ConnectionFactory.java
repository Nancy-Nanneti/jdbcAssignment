package jdbcassignment;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.sql.*;

public class ConnectionFactory {
	private static Connection connection = null;

	private ConnectionFactory() {
	}

	public static Connection getConnection() {
		// load the prop file
		InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("db1.properties");
		System.out.println("successfull");
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driver = properties.getProperty("db1.driver");
		String url = properties.getProperty("db1.url");
		String username = properties.getProperty("db1.username");
		String password = properties.getProperty("db1.password");

		// load the driver
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}

}
