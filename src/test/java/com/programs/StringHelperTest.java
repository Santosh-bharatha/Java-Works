package com.programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

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
