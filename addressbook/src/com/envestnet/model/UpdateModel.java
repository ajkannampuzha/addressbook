package com.envestnet.model;

import java.sql.SQLException;
import java.util.HashMap;

import com.envestnet.dao.UpdateDAO;

public class UpdateModel {
	private int id;
	private String field;
	private String value;
	public UpdateModel() {
		// TODO Auto-generated constructor stub
	}

	public void parseParams(HashMap<String, String> params) {
		id=Integer.parseInt(params.get("id"));
		field=params.get("field");
		value=params.get("value");
		
	}

	public void updateData() {
		UpdateDAO uDAO=new UpdateDAO(id,field,value);
		try {
			uDAO.updateData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
