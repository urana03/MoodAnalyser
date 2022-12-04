package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;

public class MoodAnalyserTest {

	 @Test
	    public void given_SadMood_Should_Return_Sad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String mood = moodAnalyser.analyseMood("I am in SAD");
	        Assert.assertEquals("SAD", mood);

	 }
}
