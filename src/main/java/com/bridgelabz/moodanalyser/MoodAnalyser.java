package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
	}
	
	public MoodAnalyser(String message) {
			this.message = message;
			return;
		}
	
	public String analyseMood() {
		try {
		
			if(message.contains("SAD")) {
			return "SAD";
		
			}
		
			else {
			return "HAPPY";
		
			}
		}
		catch(NullPointerException e) {
			return "HAPPY";
		}
	} 
}
