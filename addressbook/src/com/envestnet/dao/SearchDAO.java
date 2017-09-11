package com.envestnet.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.envestnet.bean.*;

public class SearchDAO extends DAO {
	private String sMethod;
	private String value;
	
	public SearchDAO(String sMethod,String value) {
		this.sMethod=sMethod;
		this.value=value;
		
	}
	public List<Address> searchData() throws SQLException{
		List<Address> addressList=new ArrayList<Address>();
		String sql="select * from t_address where "+sMethod+" = "+"'"+value+"'";
		Statement stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql);
		while(result.next()){
			Address address=new Address();
			address.setContact(result.getString("contact"));
			address.setFlag(result.getString("flag"));
			address.setId(result.getInt("id"));
			address.setName(result.getString("name"));
			address.setPlace(result.getString("place"));
			addressList.add(address);
			//System.out.println(result.getString("contact"));
		}
		MySqlConnection.getMySqlConnection().close();
		return addressList;
	}

}
