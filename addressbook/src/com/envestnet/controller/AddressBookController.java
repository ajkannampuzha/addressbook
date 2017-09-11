package com.envestnet.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.envestnet.bean.Address;
import com.envestnet.model.Main;
import com.envestnet.model.NewModel;
import com.envestnet.model.SearchModel;
import com.envestnet.model.UpdateModel;
import com.envestnet.view.MainUI;
import com.envestnet.view.NewUI;
import com.envestnet.view.SearchUI;
import com.envestnet.view.UpdateUI;


public class AddressBookController {
	private static AddressBookController controller;
	
	private AddressBookController(){
		controller=this;
	}
	
	public static AddressBookController getInstance(){
		if(controller==null){
			new AddressBookController();
		}
		return controller;
	}
	public static void processMain(){
		MainUI mainUI=new MainUI();
		while(true){
			HashMap<String,String> request=mainUI.menu();
			Main main=new Main(request);
			String choice=main.parseChoice();
			switch(choice){
			case "new":
				NewUI newUI=new NewUI();
				newUI.menu();
				break;
			case "search":
				SearchUI searchUI=new SearchUI();
				searchUI.printMenu();
				break;
			case "update":
				UpdateUI updateUI=new UpdateUI();
				updateUI.printUpdate();
			}
			
			
		}
	}
	
	public void processRequest(HashMap<String, String> params,String action){
		List<Address>list=new ArrayList<Address>();
		
		if(action.equals("new")){
			NewModel newModel=new NewModel();
			newModel.parseParams(params);
			newModel.insertData();
		}else if(action.equals("search")){
			
			SearchModel sModel=new SearchModel();
			sModel.parseParams(params);
			list=sModel.searchData();
			//System.out.println("i m here");
			SearchUI searchUI=new SearchUI();
			
			searchUI.printResults(list);
			
		}else if(action.equals("update")){
			UpdateModel upModel=new UpdateModel();
			upModel.parseParams(params);
			upModel.updateData();
		}
		
		
	}
	public static void main(String[] args) {
		getInstance();
		processMain();
	}

}
