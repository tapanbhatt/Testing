package com.tapan.collection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.tapan.array.arrayTest;
import com.tapan.jdbc.DBConnection;

public class CollectionsTest {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		ArrayList<String> columnData = new ArrayList<String>();
		ArrayList<String> columnHeader = new ArrayList<String>();
		StringBuffer strBuffer = new StringBuffer();
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from employee");
			rsmd = rs.getMetaData();
			System.out.println("Column Count = " + rsmd.getColumnCount());

			// Getting Column names:
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				String column = rsmd.getColumnName(i);
				strBuffer.append(column).append(",");
			}
			columnHeader.add(strBuffer.toString());
			for (String data : columnHeader) {
				System.out.println("columnHeader = " + data);
			}
			// Getting column Data:
			strBuffer.setLength(0);
			while (rs.next()) {
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					String data = rs.getString(i);
					strBuffer.append(data).append(",");
				}
				columnData.add(strBuffer.toString());
				strBuffer.setLength(0);
			}
			for (String data : columnData) {
				System.out.println("columnData = " + data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
