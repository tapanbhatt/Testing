package com.tapan.io;

import java.io.Serializable;

public class DataObject {// implements Serializable{

	// private static final long serialVersionUID = 1L;
	private int emp_id;
	private String emp_fName;
	private String emp_lName;
	private String emp_email;
	private String emp_mobile;
	private String emp_salary;

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_fName() {
		return emp_fName;
	}

	public void setEmp_fName(String emp_fName) {
		this.emp_fName = emp_fName;
	}

	public String getEmp_lName() {
		return emp_lName;
	}

	public void setEmp_lName(String emp_lName) {
		this.emp_lName = emp_lName;
	}

	public String getEmp_mobile() {
		return emp_mobile;
	}

	public void setEmp_mobile(String emp_mobile) {
		this.emp_mobile = emp_mobile;
	}

	public String getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}

}
