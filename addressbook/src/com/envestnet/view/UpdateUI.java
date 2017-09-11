package com.envestnet.view;

import java.io.IOException;
import java.util.HashMap;

import com.envestnet.controller.AddressBookController;

public class UpdateUI extends UI{
	public UpdateUI() {
		// TODO Auto-generated constructor stub
	}
	public void printUpdate(){
		System.out.println("Update");
		getParams();
	}
	private void getParams() {
		HashMap<String,String> map=new HashMap<String,String>();
		String choice=null;
		try {
			choice=getInput("enter Id:");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("id", choice);
		String uField=null;
		try {
			uField=getInput("Enter the field to be updated:");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("field", uField);
		String value=null;
		try {
			value=getInput("Enter value:");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("value", value);
		AddressBookController.getInstance().processRequest(map, "update");
		
	}

}
