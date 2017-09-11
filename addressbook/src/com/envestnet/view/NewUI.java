package com.envestnet.view;

import java.io.IOException;
import java.util.HashMap;

import com.envestnet.controller.AddressBookController;

public class NewUI extends UI {
	public NewUI() {
		// TODO Auto-generated constructor stub
	}

	public void menu() {
		String name = null;
		String contact = null;
		String place = null;
		HashMap<String,String> params=new HashMap<String, String>();
		try{
			name = getInput("Enter name:");
			contact=getInput("Enter contact:");
			place=getInput("Enter place:");
		}catch(IOException e){
			//todo
		}
		params.put("name", name);
		params.put("contact", contact);
		params.put("place", place);
		
		AddressBookController.getInstance().processRequest(params, "new");
		
		
	}
	

}
