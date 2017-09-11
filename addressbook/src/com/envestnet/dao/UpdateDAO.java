package com.envestnet.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDAO extends DAO {
	private int id;
	private String field;
	private String value;
	
	public UpdateDAO(int id, String field, String value) {
		this.id=id;
		this.field=field;
		this.value=value;
	}

	public void updateData() throws SQLException {
		String sql="update t_address set "+field+"='"+value+"' where id="+id+";";
		Statement stmt=conn.createStatement();
		int result=stmt.executeUpdate(sql);
		System.out.println(result+" rows effected");
		
		
	}
	

}
