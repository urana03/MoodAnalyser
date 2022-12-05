package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;


public class MoodAnalyserTest {

	    @Test
	    public void givenNullMoodShouldReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String mood = null;
	        try {
	        	ExpectedException exceptionRule = ExpectedException.none();
	        	exceptionRule.expect(MoodAnalysisException.class);
	        	mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY", mood);
	        }
	        catch(MoodAnalysisException e) {
	        	e.printStackTrace();
	        }
	 }	 
}
