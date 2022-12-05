package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;
	
	public MoodAnalyser(String message) {
			this.message = message;
			return;
		}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
		
			if(message.contains("SAD")) {
			return "SAD";
		
			}
		
			else {
			return "HAPPY";
		
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Please enter proper message");
		}
	} 
}
