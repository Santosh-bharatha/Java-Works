package com.programs;

public class StringHelper {

	// ABCD,BCD
	public String truncateAInFirst2Positions(String input) {
		if (input.length() < 2)
			return input.replace("A", "");
		String first2Chars = input.substring(0, 2);
		String restOfTheString = input.substring(2);
		return first2Chars.replaceAll("A", "").concat(restOfTheString);
	}

	public boolean areFirstAndLastTwoCharsTheSame(String input) {
		
		if (input.length() < 1)
			return false;
		if(input.length() < 2)
			return true;

		String first2Chars = input.substring(0,2);
		String last2Chars = input.substring(input.length()-2);
		
		return first2Chars.equals(last2Chars);
	}
}
