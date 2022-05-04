package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.model.Movie;



public class WishlistDao {
	public static Movie AddToWishlist(int id ) {
		
		String sql="select movies from wishlist where id=?";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setInt(1,id);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  System.out.println("--------> "+rs.getString("Movies"));
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return null;
		
		
	}
	

}