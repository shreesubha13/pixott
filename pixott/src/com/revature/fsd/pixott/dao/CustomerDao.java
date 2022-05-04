package com.revature.fsd.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.model.CustomerDetail;

public class CustomerDao {
	public void signup(CustomerDetail CustomerDetail) {
		String sql = "insert into customerdetail(name, mobile, password) values (?, ?, ?)";
		try(
				Connection conn = Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				){
			System.out.println("connected successfully");
			stmt.setString(1, CustomerDetail.getName());
			stmt.setString(2, CustomerDetail.getMobile());
			stmt.setString(3, CustomerDetail.getPassword());
			stmt.execute();
			System.out.println("Customer added successfully");

		}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}
	public CustomerDetail getCustomerDetail(String mobile) {
		String sql = "select * from CustomerDetail where mobile=?";
		try(
				Connection conn = Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				)
		{
			System.out.println("connected successfully");
			stmt.setString(1, mobile);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				CustomerDetail CustomerDetail = new CustomerDetail();
				CustomerDetail.setId(rs.getInt("Id"));
				CustomerDetail.setName(rs.getString("Name"));
				CustomerDetail.setMobile(rs.getString("Mobile"));
				CustomerDetail.setPassword(rs.getString("Password"));
				return CustomerDetail;
				
				}
				
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		return null;
	}
	public static void main(String args[]) {
		CustomerDao dao = new CustomerDao();
		CustomerDetail CustomerDetail = new CustomerDetail();
		CustomerDetail.setName("john");
		CustomerDetail.setMobile("9783457201");
		CustomerDetail.setPassword("password123");
		dao.signup(CustomerDetail);
	}
	

}
