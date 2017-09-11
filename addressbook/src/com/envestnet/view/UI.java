package com.envestnet.view;

import java.io.BufferedInputStream;
import java.io.IOException;

public class UI {
	private static BufferedInputStream bs=new BufferedInputStream(System.in);
	
	protected static String getInput(String string) throws IOException {
		byte[] dataChoice=new byte[100];
		System.out.println(string);
		bs.read(dataChoice);
		String choice=new String(dataChoice);
		choice=choice.trim();
		return choice;
	}

}
