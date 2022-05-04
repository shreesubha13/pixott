package com.revature.pixott.handler;

import com.revature.fsd.pixott.dao.CustomerDao;
import com.revature.pixott.model.CustomerDetail;

public class SignupHandler {
	public static void display() {
		System.out.println("Enter Name:");
		String name = App.scanner.nextLine();
		
		System.out.println("Enter mobileNumber:");
		String mobile = App.scanner.nextLine();
		
		System.out.println("Enetr Password:");
		String password = App.scanner.nextLine();
		
		CustomerDao dao = new CustomerDao();
		CustomerDetail CustomerDetail = new CustomerDetail();
		CustomerDetail.setName(name);
		CustomerDetail.setMobile(mobile);
		CustomerDetail.setPassword(password);
		dao.signup(CustomerDetail);
	}
}


