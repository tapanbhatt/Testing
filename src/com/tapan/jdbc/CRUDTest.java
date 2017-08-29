package com.tapan.jdbc;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class CRUDTest {

	private static final Logger logger = Logger.getLogger(CRUDTest.class);

	public static void main(String[] args) {

		CRUDOperation crud = new CRUDOperation();

		/*
		 * Employee emp = crud.getEmployee(3);
		 * 
		 * logger.info("Emp ID: " + emp.getID()); logger.info("First Name: " +
		 * emp.getFirstName()); logger.info("Last Name: " + emp.getLastName());
		 * logger.info("eMail ID: " + emp.getEmailId()); logger.info("Mobile: "
		 * + emp.getMobile()); logger.info("Salary: " + emp.getSalary());
		 */

		/*
		 * // Geting list of all employees : List<Employee> employees =
		 * crud.getEmployees(); logger.info("Elements in the list are :: "
		 * +employees.size()); for (Employee employee : employees) {
		 * 
		 * logger.info("Emp ID: " + employee.getID()); logger.info(
		 * "First Name: " + employee.getFirstName()); logger.info("Last Name: "
		 * + employee.getLastName()); logger.info("eMail ID: " +
		 * employee.getEmailId()); logger.info("Mobile: " +
		 * employee.getMobile()); logger.info("Salary: " +
		 * employee.getSalary()); }
		 * 
		 */

		/*
		 * Employee emp = new Employee(); emp.setID(5);
		 * emp.setFirstName("Vaibhav"); emp.setLastName("Bhatt");
		 * emp.setEmailId("vaibhav@yahoo.com"); emp.setMobile(999999999);
		 * emp.setSalary(50000); crud.UpdateEmployee(emp);
		 */
		Employee emp = null;
		emp = crud.getEmployee(1);
		   logger.info("First Name: " + emp.getFirstName());
		   logger.info("Last Name: " + emp.getLastName());
		   logger.info("eMail ID: " + emp.getEmailId());
		   logger.info("Mobile: " + emp.getMobile());
		   logger.info("Salary: " + emp.getSalary());
	}

}
