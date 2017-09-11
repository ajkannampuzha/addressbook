package com.envestnet.model;

import java.util.HashMap;

public class Main {
	private String choice;
	
	public Main(HashMap<String,String> params) {
		choice=params.get("choice");
	}
	public String parseChoice(){
		String ret=null;      
		switch(choice){
		case "1":
			ret="new";
			break;
		case "2":
			ret="search";
			break;
		case "3":
			ret="update";
			break;
		case "4":
			ret="delete";
			break;
		default:
			ret=null;
			break;
		}
		return ret;
	}

}
