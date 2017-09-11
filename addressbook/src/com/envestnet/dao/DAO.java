package com.envestnet.dao;

import java.sql.Connection;
import java.sql.SQLException;


public class DAO {
	protected Connection conn;
	public DAO() {
		try {
			conn=MySqlConnection.getMySqlConnection().connect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
