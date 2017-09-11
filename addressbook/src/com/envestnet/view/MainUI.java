package com.envestnet.view;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.envestnet.controller.AddressBookController;

public class MainUI extends UI{
	
	
	public HashMap<String,String> menu(){
		HashMap<String,String> request=new HashMap<String,String>();
		String choice=null;
		try {
			choice=getInput("1.New\n2.Search\n3.Update\n4.Delete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("choice", choice);
		//AddressBookController.getInstance().processRequest(request, "main");
		return request;
		
	}
}
