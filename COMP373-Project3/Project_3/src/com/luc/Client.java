package com.luc;

import java.io.File;

public class Client implements Observer {

	
	public void accessWebpage(String url) {
		
		Server webProxy = new WebProxy(url);
		webProxy.fetchPage(this);
	}
	
	@Override
	public void notify(File webpage) {
		// show my webpage
		System.out.println("The client received the webpage: " + webpage.getPath());
	}

}
