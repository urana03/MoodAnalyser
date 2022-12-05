package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;


public class MoodAnalyserTest {

	 @Test
	    public void givenNullMoodShouldReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY", mood);
	 }	 
}
