package com.tapan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class DBConnection {
	
	private static final Logger logger = Logger.getLogger(DBConnection.class);

	private static Connection conn = buildConnection();

	private static Connection buildConnection() {

		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CoreJava", "postgres", "admin");
			logger.info("======================Getting Conenction From DB=============================");
			logger.info("Connection Object :: " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static Connection getConnection() {
		return conn;
	}
}
