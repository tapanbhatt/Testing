package com.tapan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tapan.jdbc.DBConnection;
import com.tapan.jdbc.Employee;

public class ExportData {

	public void exportDataToFile(List<DataObject> employees, File file) {
		ObjectOutputStream objectOutputStream = null;

		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			for (DataObject dataObject : employees) {
				objectOutputStream.writeObject(dataObject);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null)
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public void exportDataToCsv(List<DataObject> employees, File file) {
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(file);
			for (DataObject dataObject : employees) {
				System.out.println("dataObject.getEmp_fName() = "+dataObject.getEmp_fName() );
				fileWriter.append(String.valueOf(dataObject.getEmp_id()));
				fileWriter.append(",");
				fileWriter.append(dataObject.getEmp_fName());
				fileWriter.append(",");
				fileWriter.append(dataObject.getEmp_lName());
				fileWriter.append(",");
				fileWriter.append(dataObject.getEmp_email());
				fileWriter.append(",");
				fileWriter.append(dataObject.getEmp_mobile());
				fileWriter.append(",");
				fileWriter.append(dataObject.getEmp_salary());
				fileWriter.append("\n");
			}
			fileWriter.flush();
	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null)
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public List<Employee> ReadDataToFile(File file) {
		ObjectInputStream objectInputStream = null;
		List<Employee> employees = new ArrayList<>();
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(file));

			for (Employee employee : employees) {
				Employee emp = (Employee) objectInputStream.readObject();
				employees.add(emp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objectInputStream != null)
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return employees;
	}

	public List<DataObject> getEmployeeData() {

		List<DataObject> employees = new ArrayList<DataObject>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		conn = DBConnection.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
			rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();

			/*
			 * // Get Header information for (int i = 1; i <= count; i++) {
			 * System.out.println(rsmd.getColumnName(i)); }
			 */
			DataObject data = null;
			while (rs.next()) {
				data = new DataObject();
				data.setEmp_id(rs.getInt("emp_id"));
				data.setEmp_fName(rs.getString("emp_fname"));
				data.setEmp_lName(rs.getString("emp_lname"));
				data.setEmp_email(rs.getString("emp_email"));
				data.setEmp_mobile(rs.getString("emp_mobile"));
				data.setEmp_salary(rs.getString("emp_salary"));
				employees.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

}
