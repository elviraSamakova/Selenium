package com.syntax.class02;

public class SFirefoxDriver implements SWebDriver{

	SFirefoxDriver(){
		System.err.println("Opening Firefox Browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Lunching the url:: "+url);
	}

	@Override
	public void getCurrentUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
