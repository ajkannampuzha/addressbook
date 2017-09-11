package com.envestnet.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.envestnet.bean.Address;
import com.envestnet.dao.SearchDAO;

public class SearchModel {
	private String sMethod;
	private String value;

	public void parseParams(HashMap<String, String> params) {
		if(params.get("choice").equals("1")){
			sMethod="name";
		}else if(params.get("choice").equals("2")){
			sMethod="contact";
		}else if(params.get("choice").equals("3")){
			sMethod="place";
		}
		value=params.get("value");
		
	}
	public List<Address> searchData(){
		SearchDAO sDAO=new SearchDAO(sMethod,value);
		List<Address> ret=new ArrayList<Address>();
		try {
			ret=sDAO.searchData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
