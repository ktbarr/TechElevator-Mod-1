package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest
{
	@SuppressWarnings({ "serial", "unused" })
	@Test
	
	public void wordCountSheep()
	{
		// arrange
		Map<String, Integer> words = new HashMap<String, Integer>();
		String[] word1 = {"ba", "ba", "black", "sheep"};
		Map<String, Integer> expected = new HashMap<String, Integer>() 
		{{
			put("ba", 2);
			put("black", 1);
			put("sheep", 1);
		}};
		WordCount dictionaryEntry = new WordCount();
			
		//act
		Map<String, Integer> actual = dictionaryEntry.getCount(word1);
		
		//assert
		Assert.assertEquals("New dictionary<string, int> will be", expected, actual);
		
	}

}
