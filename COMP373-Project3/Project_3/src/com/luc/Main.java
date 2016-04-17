package com.luc;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		
		Client client = new Client();
		
		String url1 = "https://thepiratebay.se/s/?q=TITANIC&page=0&orderby=99";
		String url2 = "http://luc.edu/cs/people/ptfaculty/berhanezewdie.shtml";
		
		System.out.println("Trying to access: " + url1);
		client.accessWebpage(url1);
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Trying to access: " + url2);
		client.accessWebpage(url2);
	}

}
