package com.cg.eis.pl;

import com.cg.eis.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		
		EmployeeService es = new EmployeeService();
		
		es.getEmpDetails();
		es.dispEmpDetails();
	}

}