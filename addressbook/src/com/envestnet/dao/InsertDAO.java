package com.envestnet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDAO extends DAO{
	private String name;
	private String contact;
	private String place;
	
	public InsertDAO(String name,String contact,String place) {
		this.name=name;
		this.contact=contact;
		this.place=place;
		try {
			insertData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void insertData() throws SQLException{
		String sql="insert into t_address(name,contact,place) values (?,?,?);";
		PreparedStatement stmt=null;
	
		stmt=conn.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setString(2, contact);
		stmt.setString(3, place);
		 
		int result=stmt.executeUpdate();
		
		System.out.println(result+" rows effected");
		MySqlConnection.getMySqlConnection().close();
		
		
		
		
	}
	

}
