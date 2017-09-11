package com.envestnet.model;

import java.util.HashMap;

import com.envestnet.dao.InsertDAO;

public class NewModel {
	private String name;
	private String contact;
	private String place;
	public NewModel() {
		// TODO Auto-generated constructor stub
	}

	public void parseParams(HashMap<String, String> params) {
		
		name=params.get("name");
		contact=params.get("contact");
		place=params.get("place");
		
	}
	public void insertData(){
		InsertDAO insert=new InsertDAO(name, contact, place);
		
		
	}

}
