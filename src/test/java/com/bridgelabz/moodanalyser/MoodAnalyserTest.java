package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;
import org.junit.*;

public class MoodAnalyserTest {

	 
	 @Test
		public void given_AnyMood_Should_Return_HAPPY() {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analyseMood("I am in any Mood");
			Assert.assertEquals("HAPPY", mood);
	  }
	 
}
