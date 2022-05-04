package com.revature.pixott.handler;

import com.revature.fsd.pixott.dao.CustomerDao;
import com.revature.pixott.model.CustomerDetail;

public class LoginHandler {
	
	public static void display() {
		System.out.println("Enter mobileNumber:");
		String mobile = App.scanner.nextLine();
		
		System.out.println("Enetr Password:");
		String password = App.scanner.nextLine();
		
		CustomerDao dao = new CustomerDao();
		CustomerDetail CustomerDetail = dao.getCustomerDetail(mobile);
		if(password.equals(CustomerDetail.getPassword())) {
			System.out.println("login successfull");
			System.out.println("Welcome "+CustomerDetail.getName()+" !");
			UserMenu.menuDisplay();
		}
		else {
			System.out.println("invalid or incorrect password");
		}
		
	}
}
