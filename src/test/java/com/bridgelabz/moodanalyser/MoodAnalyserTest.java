package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;


public class MoodAnalyserTest {

	 @Test
	    public void given_SadMood_Should_Return_Sad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in SAD");
	        String mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("SAD", mood);
	 }	 
}
