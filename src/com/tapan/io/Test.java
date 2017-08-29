package com.tapan.io;

import java.io.File;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ExportData data = new ExportData();
		List<DataObject> dataObj = data.getEmployeeData();

		for (DataObject dataObject : dataObj) {
			System.out.println("emp id = " + dataObject.getEmp_id());
			System.out.println("emp fName = " + dataObject.getEmp_fName());
			System.out.println("emp lName = " + dataObject.getEmp_lName());
			System.out.println("emp mobile = " + dataObject.getEmp_mobile());
			System.out.println("emp email = " + dataObject.getEmp_email());
			System.out.println("emp salary = " + dataObject.getEmp_salary());
		}

		// data.exportDataToFile(dataObj, new File("Object.txt"));
		data.exportDataToCsv(dataObj, new File("Object.csv"));

	}
}
