package com.programs;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper = new StringHelper();
	private String input;
	private String expectedOutput;
	
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection testConditions(){
		
		String expectedOutputs[][] = {{"ACD","CD"},
		                     		{"AACD", "CD"}}; 
		
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateInFirst2Positions(){
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	@Test
	public void test() {
		
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void test2(){
		

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative(){
		assertFalse(helper.areFirstAndLastTwoCharsTheSame("ABCD"));
	}
	
	@Test
	public void testAssertFalse(){
		assertFalse(helper.areFirstAndLastTwoCharsTheSame("ABCD"));
	}

	@Test
	public void testAssertTrue(){
		assertTrue(helper.areFirstAndLastTwoCharsTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharacterstheSame_BasicNegativeScenario(){
		assertFalse(helper.areFirstAndLastTwoCharsTheSame("ABCD"));
	}
}
