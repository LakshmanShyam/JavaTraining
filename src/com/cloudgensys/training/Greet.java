package com.cloudgensys.training;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Greet {

	public static String greetMe = "Hi Shyam";
	public static String greetTeam = "Hi Team";
	public static String greetEveryOne = "Hello World !!!";
	
	public String greetWithTime = "Hello team : the time is" + System.currentTimeMillis();
	
	public String getGreetMe(){
		return greetMe;
	}
	
	public void setGreetMe(String message){
		greetMe = message;
	}
	
	public String getGreetTeam(){
		return greetTeam;
	}
	
	public String getGreetEveryOne(){
		return greetEveryOne;
	}
}
