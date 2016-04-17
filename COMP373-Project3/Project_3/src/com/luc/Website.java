package com.luc;

import java.io.File;

public class Website implements Server {
	
	private String url;
	
	public Website(String url) {
		this.url = url;
	}

	@Override
	public void fetchPage(Observer o) {
		
		new Thread() {
			public void run() {
				try {
					
					System.out.println("Waiting.... The webpage is being fetched from the server.\n");
					Thread.sleep(2000);
					
					System.out.println("The webpage was fetched. Notifying the client (observer)....\n");
					Thread.sleep(1000);
					o.notify(new File(url));
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}

}
