package com.envestnet.view;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.envestnet.bean.Address;
import com.envestnet.controller.AddressBookController;

public class SearchUI extends UI {

	public SearchUI() {
		//printMenu();
	}

	public void printMenu() {
		String choice=null;
		HashMap<String,String> request=new HashMap<String,String>();
		try {
			choice=getInput("1.Name Search\n2.Contact Search\n3.Place Serach");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("choice", choice);
		String value=null;
		try {
			value=getInput("Enter value");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.put("value", value);
		AddressBookController.getInstance().processRequest(request, "search");
		
	}

	public void printResults(List<Address> list) {
		for(Address a:list){
			if(a!=null){
				System.out.println("id="+a.getId());
				System.out.println("name="+a.getName());
				System.out.println("Contact="+a.getContact());
				System.out.println("place="+a.getPlace());
				System.out.println("Flag="+a.getFlag());
			}
		}
		
	}
}
