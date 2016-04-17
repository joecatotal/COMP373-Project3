package com.luc;

public class WebProxy implements Server {
	
	String url;
	Website website;
	
	public WebProxy(String url) {
		this.url = url;
	}

	@Override
	public void fetchPage(Observer o) {
		
		boolean denied = false;
		
		if (url.contains("thepiratebay.se")) {
			denied = true;
		} else if (url.contains("extratorrent.com")) {
			denied = true;
		} else if (url.contains("couchtuner.com")) {
			denied = true;
		}
		
		if (denied) {
			System.out.println("The url cannot be fetched because the website is banned.\n");
			return;
		}
		
		website = new Website(url);
		website.fetchPage(o);
	}
	
	
	

}
