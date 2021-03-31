package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

		public static Connection getConnection() throws SQLException {
			
			String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=root";
			return DriverManager.getConnection(jdbcURL);
		}

}
