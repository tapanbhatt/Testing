package com.tapan.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class CRUDOperation {

	private static final Logger logger = Logger.getLogger(CRUDOperation.class);

	// Getting the employee from id with statement:

	public Employee getEmployee(int id) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from employee where EMP_ID=" + id);
			while (rs.next()) {
				emp = new Employee();
				emp.setID(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setEmailId(rs.getString(4));
				emp.setMobile(rs.getLong(5));
				emp.setSalary(rs.getInt(6));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<Employee>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee emp = null;

		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from employee");
			while (rs.next()) {
				emp = new Employee();
				emp.setID(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setEmailId(rs.getString(4));
				emp.setMobile(rs.getLong(5));
				emp.setSalary(rs.getInt(6));
				employees.add(emp);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;

	}

	public void UpdateEmployee(Employee emp) {
		Connection conn = null;
		Statement stmt = null;
		try {

			conn = DBConnection.getConnection();
			stmt = conn.createStatement();

			logger.info("Employee id " + emp.getID());

			String query = "update employee " + "set FirstName='" + emp.getFirstName() + "'," + "LastName='"
					+ emp.getLastName() + "'," + "email='" + emp.getEmailId() + "'," + "mobile='" + emp.getMobile()
					+ "'," + "salary='" + emp.getSalary() + "'" + "where ID='" + emp.getID() + "'";
			logger.info("query ::: " + query);
			int i = stmt.executeUpdate(query);
			logger.info("REcordd updated " + i);
			logger.info("Employee updated successfully" +i);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Employee testResultSet(int id) throws SQLException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from employee where EMP_ID='" + id + "'");

			while (rs.next()) {
				emp = new Employee();
				rs.updateString(2, "Tarun");
				rs.updateString(3, "Sharma");
				rs.updateString(4, "tarun@yahoo.co.in");
				rs.updateLong(5, 11111111);
				rs.updateInt(6, 7000);
				rs.updateRow();
				logger.info("Result set updated successfully !!");
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setEmailId(rs.getString(4));
				emp.setMobile(rs.getLong(5));
				emp.setSalary(rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emp;
	}

}
