package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;


public class MoodAnalyserTest {

	 @Test
	    public void given_SadMood_Should_Return_Sad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
	        String mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY", mood);
	 }	 
}
